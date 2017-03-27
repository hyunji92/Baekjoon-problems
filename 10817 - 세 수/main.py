input = input().split(" ")

n = list(range(3))
n[0] = int(input[0])
n[1] = int(input[1])
n[2] = int(input[2])

print(sorted(n)[1])