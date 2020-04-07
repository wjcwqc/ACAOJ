'''a = input().split()
a.sort()
'''
while 1 :
    alist=list(map(int,input().split()))
    if (alist == [0]):
        break
    del alist[0]
    alist = sorted(alist, key=abs, reverse = True)
    for i in range(len(alist)):
        if (i==len(alist)-1):
            print(alist[i])
        else:
            print(alist[i],end=' ')
