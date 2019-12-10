def f(x):
    if (x == 1):
        return 10
    else:
        return f(x-1) + 2
num = int(input())
print(f(num))
