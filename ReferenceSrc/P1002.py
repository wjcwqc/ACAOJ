import math

a, b ,c = map(int, input().strip().split())
d = (b*b) - (4*a*c)
if (d>=0):
    x1 = (-b-math.sqrt(d))/(2*a)
    x2 = (-b+math.sqrt(d))/(2*a)
    if(x1 >= x2):
        print('%.2f %.2f' % (x1,x2))
    else:
        print('%.2f %.2f' % (x2,x1))
else:
    print('error')

