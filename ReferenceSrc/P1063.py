while True:
    s = input()
    if(s == ''):
        break
    else:
        #x1,y1,x2,y2 = map(int, input().strip().split())
        ss = s.split()
        x1,y1,x2,y2 = float(ss[0]),float(ss[1]),float(ss[2]),float(ss[3])
        l =  pow(pow(x1-x2,2) + pow(y1-y2,2),1/2)
        print('%.2f' % l)
