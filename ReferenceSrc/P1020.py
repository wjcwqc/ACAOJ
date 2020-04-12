string = input()
s = string.split()
a = range(10)
for i in a:
    s[i] = int(s[i])
s.sort(reverse=1)
for i in a:
    if (i==9):
        print(s[9])
    else:
        print(s[i],end = ' ')
