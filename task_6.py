# 6 -> Write a Python program to get the smallest number from a list.

def smallest(a):
    if not a:
        return None  # Return None if the list is empty
    return min(a)

numbers = []
n = int(input("Enter number of elements : "))
 
# iterating till the range
for i in range(0, n):
    ele = int(input())
    # adding the element
    numbers.append(ele)  
 
print(numbers)

sm = smallest(numbers)
print(f"The smallest number is: {sm}")
