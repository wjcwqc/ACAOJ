while True:
    string = input()
    if(string == ''):
        break
    s = string.split()
    m,n= int(s[0]),int(s[1])
    x,y=0,0
    for i in range(m,n+1):
        if(i%2):
            #奇数(y)
            y += pow(i,3)
        else:
            x += pow(i,2)
    print('%d %d' % (x,y))
    
