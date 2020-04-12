string = input()
s = string.split()
a = range(4)
for i in a:
    s[i] = int(s[i])
s.sort()
for i in a:
    if (i==9):
        print(s[3])
    else:
        print(s[i],end = ' ')
