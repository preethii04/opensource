n=int(input())
array = list(map(int, input().split()))
res =0
for num in array:
    res ^= num
print(res)
