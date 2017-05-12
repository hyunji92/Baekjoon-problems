num_origin = input()
# str

if len(num_origin) == 1:
    num_origin += '0'

cycled_num = num_origin[-1] + str(int(num_origin[0]) + int(num_origin[1]))[-1]

cycle = 1
# already 1 cycled

while str(num_origin) != cycled_num:
    cycled_num = cycled_num[-1] + str(int(cycled_num[0]) + int(cycled_num[1]))[-1]
    cycle += 1

print(cycle)
