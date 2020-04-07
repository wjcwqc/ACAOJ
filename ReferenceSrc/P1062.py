while True:
    s = input()
    if (s==''):
        break
    day = int(s)
    x = 1
    for i in range(day-1):
        x = 2*(x+1)
    print(x)
