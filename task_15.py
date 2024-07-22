# 15 -> Write a Python program to replace dictionary values with their sums.

def replace_values_with_sum(d):
    total_sum = sum(d.values())
    return {k: total_sum for k in d}

d = {'a': 1, 'b': 2, 'c': 3, 'd': 4}
summed_values_dict = replace_values_with_sum(d)
print(f"Dictionary with values replaced by their sum: {summed_values_dict}")
