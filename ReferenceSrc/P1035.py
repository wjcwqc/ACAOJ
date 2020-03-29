a = []
for i in range(200000):
    if i >= 100:
        if ((i%1000)**2)%1000 == (i%1000):
            a.append(i)
            #print (i,end = '  ')
    elif 10<= i < 100:
        if (i**2)%100 == i:
            a.append(i)
            #print (i,end = '  ')
    else:
        if (i**2)%10 == i:
            a.append(i)
            #print (i,end = '  ')
for i in range(len(a)):
    print (a[i],end = '  ')
