# 5 -> Write a Python program to calculate sum of digits of a number.

def sum_of_digits(number):
    return sum(int(digit) for digit in str(number))


number = input("Enter a number. : ")
digit_sum = sum_of_digits(number)
print(f"The sum of the digits of {number} is {digit_sum}")
