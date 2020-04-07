for i in range(1000,10000):
    if (i == pow((i - i%100)//100 + i%100,2)):
        print("%d" % i,end='  ')
