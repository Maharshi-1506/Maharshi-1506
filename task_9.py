# 9 -> Write a Python program to calculate the average value of the numbers in a given tuple of tuples. 

def average_of_tuples(tuples):
    total_sum = 0
    total_count = 0
    for tpl in tuples:
        total_sum += sum(tpl)
        total_count += len(tpl)
    return total_sum / total_count if total_count != 0 else 0

tuples = ((10, 20, 30), (40, 50, 60), (70, 80, 90))
average = average_of_tuples(tuples)
print(f"The average value is: {average:}")
