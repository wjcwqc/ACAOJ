s = input().split()
max_ = -1
for i in s:
    if (i == '-1'):
        break
    elif (int(i)>max_):
        max_ = int(i)
print(max_)
