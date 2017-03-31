max = 0
index = 0

for i in range(1, 6):
    sum = 0
    for score in input().split(" "):
        sum += int(score)
    if(sum >= max):
        max = sum
        index = i

print(index, max)