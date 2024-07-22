# 10 -> Write a Python program to find items starting with a specific character from a list.

def find_items_starting_with(l1, char):
    return [item for item in l1 if item.startswith(char)]


words= []
n = int(input("Enter number of elements : "))
 
# iterating till the range
for i in range(0, n):
    ele = str(input())
    # adding the element
    words.append(ele)  

char = str(input("Enter char to search.:"))
matching_items = find_items_starting_with(words, char)
print(words)
print(f"Items starting with '{char}': {matching_items}")
