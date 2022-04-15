from sklearn import linear_model
from unittest import result
import numpy as np
import matplotlib.pyplot as plt
import pandas as pd
data_frame = pd.read_csv('test2.csv')
x = data_frame['Cricket chirps per Minute ']
y = data_frame['Temperature']
print(x, y)
# Training the model
linear_regression = linear_model.LinearRegression()
linear_regression.fit(
    data_frame[['Cricket chirps per Minute ']], data_frame['Temperature'])
# Drawing the graph
plt.xlabel('Cricket chirps per Minute ', fontsize=10)
plt.ylabel('Temperature', fontsize=10)
plt.scatter(data_frame['Cricket chirps per Minute '],
            data_frame['Temperature'], color='green', marker='o')
# plt.show()
# Predicting the value
result = linear_regression.predict([[70]])
print(result)
print(linear_regression.coef_)
print(linear_regression.intercept_)
plt.plot(data_frame['Cricket chirps per Minute '], linear_regression.coef_ *
         data_frame['Cricket chirps per Minute '] + linear_regression.intercept_, color='red')
plt.show()