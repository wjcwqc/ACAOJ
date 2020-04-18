while True:
    s =input()
    if(s ==''):
        break
    n = int(s)
    result = 1
    for i in range(1,n+1):
        result *= i
    print(result)
