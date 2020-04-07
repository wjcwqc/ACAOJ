import math

while 1 :
    s = input()
    if(s == ''):
        break
    else:
        r = float(s)
        v = 4*pow(r,3)*math.pi/3
        print("%.3f" % v)
