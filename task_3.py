# 3 -> Write a Python program to calculate the body mass index. 
"""
 BMI = weight/height^2
BMI is calculated using the formula:
where:
- weight is in kilograms,
- height is in meters.
"""

def calculate_bmi(weight, height):
    bmi = weight / (height ** 2)
    return bmi


weight = float(input("Enter Your Weight.(kg) :"))
height = float(input("Enter Your Height.(meter) :"))

bmi = calculate_bmi(weight, height)
print(f"Your BMI is: {bmi:}")
