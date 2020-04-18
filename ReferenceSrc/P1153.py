from math import sqrt
def is_prime(n):
    if n == 1:
        return False
    for i in range(2, int(sqrt(n))+1):
        if n % i == 0:
            return False
    return True
num = 0
result = []
for i in range(100,201):
    if(is_prime(i)):
        num += 1
        result.append(i)
print(num)
for i in range(num):
    if(i==num-1):
        print(result[i])
    else:
        print(result[i],end=' ')
