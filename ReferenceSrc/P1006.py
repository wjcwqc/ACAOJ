def is_IP(a,b,c,d):
    if (a.isnumeric() and b.isnumeric() and c.isnumeric() and d.isnumeric()):
        if (0<=int(a)<=255 and 0<=int(b)<=255 and 0<=int(c)<=255 and 0<=int(d)<=255):
            print('Y')
        else:
            print('N')
    else:
        print('N')

while 1:
    string = input()
    if (string == 'End of file'):
        break
    else:
        s = string.split('.')
        a,b,c,d = s[0],s[1],s[2],s[3]
        is_IP(a,b,c,d)
