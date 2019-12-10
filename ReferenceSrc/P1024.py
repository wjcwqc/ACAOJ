def factorial(n):
    j = 1
    for i in range(1,n+1):
        j *= i
    return j
n = int(input())
s = 1
for k in range(2,n+1):
    s += factorial(k)
print(s)
