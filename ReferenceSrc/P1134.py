days = [0,31,28,31,30,31,30,31,31,30,31,30,31]
def is_yun_nian(yy):
    if(yy%100 == 0):
        if(yy%400 == 0):
            return True
        return False
    if(yy%4 == 0):
        return True
    return False
while True:
    string = input()
    if(string == ''):
        break
    ss = string.split()
    y ,m ,d= int(ss[0]),int(ss[1]),int(ss[2])
    s = ''
    for i in range(10000):
        #if(d == days[m]):#如果是一个月的最后一天
        if(m == 2):#如果是2月
            if (is_yun_nian(y)):#如果是闰年
                days[2] = 29
        d += 1
        if(d-1 == days[m]):
            d = 1
            m += 1
            days[2] = 28
        if(m == 13):
            m=1
            y +=1
    print('%d-%d-%d' % (y,m,d))
