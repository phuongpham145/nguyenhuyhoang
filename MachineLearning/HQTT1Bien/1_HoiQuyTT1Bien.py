#y = m*x + b
# y = output = label
# x = input = feature
# m = slope = weight = gradient = coefficient
# b = y-intercept = bias = intercept
from unittest import result
import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
from sklearn import linear_model
data_frame = pd.read_csv('HousePrice.csv')  # Doc file
# print(data_frame)
# print(data_frame.area)
plt.xlabel("House's area", fontsize=20)
plt.ylabel("Price", fontsize=20)
plt.scatter(data_frame.area, data_frame.price, color='red', marker='+')
# plt.show()
linear_regression = linear_model.LinearRegression()
# Train the model
linear_regression.fit(data_frame[['area']], data_frame.price)
result = linear_regression.predict([[3700]])
print(result)
print(linear_regression.coef_)  # = m
print(linear_regression.intercept_)  # = b
print(linear_regression.coef_ * 3700 +
      linear_regression.intercept_)  # = y_predicted
plt.plot(data_frame.area, linear_regression.coef_ *
         data_frame.area + linear_regression.intercept_, color='yellow')
plt.show()
#MSE = Minimun Squared Error Sai so nho nhat