def is_prime(n):
    if n == 1:
        return 0
    for i in range(2,int(n**(0.5))+1):
        if n % i == 0:
            return 0
    return 1
a = is_prime(int(input()))
print(a)
