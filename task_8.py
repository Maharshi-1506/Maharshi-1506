# 8 -> Write a Python program to check whether an element exists within a tuple. 

tpl = (1, 2, 3, 4, 5)
num = int(input("Enter number to search.:"))

if num in tpl:
    print("Number is present inside the tuple.")
else:
    print('Number is not present inside the tuple.')
    