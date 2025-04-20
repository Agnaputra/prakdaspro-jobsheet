import pandas as pd
import numpy as np
from scipy.stats import norm, zscore
import matplotlib.pyplot as plt
import seaborn as sns
from sklearn.linear_model import LinearRegression
from sklearn.preprocessing import LabelEncoder
from sklearn.metrics import r2_score

# Load dataset
df = pd.read_csv("insurance.csv")

# --- SECTION 1: DESCRIPTIVE ANALYSIS ---

# 1a. Descriptive Statistics
desc = df[['charges', 'age', 'bmi']].agg(['mean', 'median', 'min', 'max', 'std'])
print("Descriptive Statistics:\n", desc)

# 1b. Histograms
sns.histplot(df['charges'], kde=True, color='skyblue')
plt.title('Histogram of Charges')
plt.show()

sns.histplot(df['bmi'], kde=True, color='salmon')
plt.title('Histogram of BMI')
plt.show()

# 1c. Outlier detection using Z-scores
df['z_charges'] = zscore(df['charges'])
outliers = df[df['z_charges'].abs() > 3]
print("Outlier count (|Z| > 3 in charges):", len(outliers))

# --- SECTION 2: PROBABILITY DISTRIBUTION ---

# 2a. P(charges > 15000)
mean_c = df['charges'].mean()
std_c = df['charges'].std()
p_over_15000 = 1 - norm.cdf(15000, mean_c, std_c)
print(f"Probability charges > $15000: {p_over_15000:.4f}")

# 2b. % with BMI < 25
bmi_below_25 = (df['bmi'] < 25).mean() * 100
print(f"Percentage of patients with BMI < 25: {bmi_below_25:.2f}%")

# 2c. Boxplots
sns.boxplot(y=df['charges'], color='lightblue')
plt.title("Boxplot of Charges")
plt.show()

sns.boxplot(y=df['bmi'], color='lightcoral')
plt.title("Boxplot of BMI")
plt.show()

# --- SECTION 3: REGRESSION ANALYSIS ---

# 3a. Simple Linear Regression (charges ~ bmi)
X_bmi = df[['bmi']]
y = df['charges']
model_simple = LinearRegression().fit(X_bmi, y)
print(f"Simple Regression: ŷ = {model_simple.intercept_:.2f} + {model_simple.coef_[0]:.2f}*bmi")
print(f"R² (simple): {r2_score(y, model_simple.predict(X_bmi)):.4f}")

# 3b. Multiple Linear Regression (charges ~ age + bmi + children + smoker)
df_encoded = df.copy()
df_encoded['smoker'] = LabelEncoder().fit_transform(df_encoded['smoker'])  # yes=1, no=0

X_multi = df_encoded[['age', 'bmi', 'children', 'smoker']]
y = df_encoded['charges']
model_multi = LinearRegression().fit(X_multi, y)

print(f"Multiple Regression: ŷ = {model_multi.intercept_:.2f} + "
      f"{model_multi.coef_[0]:.2f}*age + {model_multi.coef_[1]:.2f}*bmi + "
      f"{model_multi.coef_[2]:.2f}*children + {model_multi.coef_[3]:.2f}*smoker")
print(f"R² (multiple): {r2_score(y, model_multi.predict(X_multi)):.4f}")

# 3c. Correlation analysis
correlations = df_encoded[['age', 'bmi', 'children', 'smoker', 'charges']].corr()['charges'].drop('charges')
print("\nCorrelation with charges:\n", correlations)
print("Strongest predictor:", correlations.idxmax())
