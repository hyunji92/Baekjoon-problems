num_origin = input()
# input default str

if len(num_origin) == 1:
    num_origin += '0'

num_temp = num_origin[-1] + str(int(num_origin[0]) + int(num_origin[1]))[-1]

cycle = 1
# already 1 cycled

while str(num_origin) != num_temp:
    cycle += 1

    num_temp = num_temp[-1] + str(int(num_temp[0]) + int(num_temp[1]))[-1]

print(cycle)
