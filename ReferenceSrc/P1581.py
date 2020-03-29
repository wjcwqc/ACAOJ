number = input()
rand_num = input().split()
def quchong(l):
    l_new = []
    for i in l:
        if int(i) in l_new:
            continue
        else:
            l_new.append(int(i))
    return l_new

num = quchong(rand_num)
num.sort()
len_ = len(num)
print(len_)
for i in num:
    if i == num[-1]:
        print(i)
    else:
        print(i,end = ' ')
