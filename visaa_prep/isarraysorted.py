n = int(input())
nums = list(map(int, input().split()))
sorted = True
for i in range(n-1):
    if nums[i] >nums[i+1]:
        sorted = False
        break
print("true" if sorted else "false")
