n = int(input())
for i in range(1, n+1):
    lefttriangle = ''.join(str(j) for j in range(1,i+1))
    righttriangle = ''.join(str(j) for j in range(i,0, -1)).rjust(n)
    print(lefttriangle.ljust(n)+righttriangle)
