def dao(string):
    s = ''
    for i in range(len(string)):
        s += string[- (i+1)]
    return s


number = int(input())
for i in range(number):
    num = input()
    step = 0
    while True:
        step += 1
        if (step == 9):
            print(0)
            break
        a = str(int(num) + int(dao(num)) )
        if (a == dao(a)):
            print(step)
            break
        else:
            num = a
