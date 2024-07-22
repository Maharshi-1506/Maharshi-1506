# 12 -> Write a Python program to check if two given sets have no elements in common. 

set1 = {1, 2, 3}
set2 = {4, 5, 6}
set3 = {3, 4, 5}

# isdisjoint = Return True if two sets have a null intersection
print(f"Set1 and Set2 have no elements in common: {set1.isdisjoint(set2)}")
print(f"Set1 and Set3 have no elements in common: {set1.isdisjoint(set3)}")