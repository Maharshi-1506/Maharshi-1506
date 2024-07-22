# 1-> Write a Python program to compute the future value of a specified principal amount, rate of interest, and number of years.
"""
    The future value (FV) of an investment can be calculated using the formula:
     FV = P \times (1 + r)^n 
    where:
    - P  is the principal amount,
    - r  is the annual interest rate (as a decimal),
    - n  is the number of years.
"""
def future_value(principal, rate, years):
    fv = principal * (1 + rate) ** years
    return fv

 #get data or values from user 
principal =int(input("Enter amount. :"))  
rate = float(input("Enter interst rate. :"))       
years = float(input("Enter number of years. :"))        

fv = future_value(principal, rate, years)
print(f"The future value is: {fv}")

