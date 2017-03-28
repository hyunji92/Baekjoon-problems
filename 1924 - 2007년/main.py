import calendar

input = input().split(" ")
month = int(input[0])
date = int(input[1])

weekday_name = ['MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT', 'SUN']
weekday = calendar.weekday(2007, month, date)

print(weekday_name[weekday])