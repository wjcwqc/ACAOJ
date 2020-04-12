from math import sqrt
string = input().split()
a,b = int(string[0]),int(string[1])
def is_huiwen(n):
    s = str(n)
    ss = ''
    for i in range(len(s)):
        ss += s[-i-1]
    if(s == ss):
        return True
    else:
        return False
def is_prime(n):
    if n == 1:
        return False
    for i in range(2, int(sqrt(n))+1):
        if n % i == 0:
            return False
    return True
for i in range(a,b+1):
    if(is_prime(i)):
        if(is_huiwen(i)):
            print(i)
