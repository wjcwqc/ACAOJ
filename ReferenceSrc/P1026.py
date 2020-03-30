a, n = map(int, input().strip().split())
s = 0
for i in range(n):
    s += int(str(a)*(i+1))
print(s)
