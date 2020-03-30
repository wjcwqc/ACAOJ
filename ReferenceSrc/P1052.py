def t(n,x):
    #n为待转换的十进制数，x为进制，取值为2-16
    a=[0,1,2,3,4,5,6,7,8,9,'A','b','C','D','E','F']
    b=[]
    while True:
        s=n//x  # 商
        y=n%x  # 余数
        b=b+[y]
        if s==0:
            break
        n=s
    b.reverse()
    r = ''
    for i in b:
        r += str(a[i])
    return r

def is_huiwen(n):
    n2 = ''
    for i in range(len(n)):
        n2 += n[-(i+1)]
    if(n2 == n):
        return True
    else:
        return False

x = int(input())
num = input()
step = 0
is_huiwenshu = False
for i in range(30):
    num_10_1 = int(num,x)
    num2 = ''
    for i in range(len(num)):
        num2 += num[-(i+1)]

    num_10_2 = int(num2,x)

    num = t(num_10_1 + num_10_2,x)
    step += 1
    if is_huiwen(num):
        is_huiwenshu = True
        break

if(is_huiwenshu):
    print('STEP=%d' % step)
else:
    print('Impossible')




        
