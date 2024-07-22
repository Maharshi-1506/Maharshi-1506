# 2 -> Write a Python program that converts seconds into days, hours, minutes, and seconds. 

def convert_seconds(seconds):
    days = seconds // 86400 # 1 day = 86400 seconds 
    seconds %= 86400
    hours = seconds // 3600 # 1 hour = 3600 seconds 
    seconds %= 3600
    minutes = seconds // 60 # 1 minute = 60 seconds
    seconds %= 60
    return days, hours, minutes, seconds

'''Example usage:'''

ts = int(input("Enter seconds. :"))
days, hours, minutes, remaining_seconds = convert_seconds(ts)
print(f"{days} days, {hours} hours, {minutes} minutes, {remaining_seconds} seconds")
