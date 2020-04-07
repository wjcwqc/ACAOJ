s = []
num = int(input())
ss = input().split()
for i in range(num):
    if not(int(ss[i]) in s):
        s.append(int(ss[i]))
s.sort()
len_ = len(s)
for i in range(len_):
    if(i == len_):
        print(s[i])
    else:
        print(s[i],end=' ')
