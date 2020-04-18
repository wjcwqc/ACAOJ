while True:
    s = input()
    if(s==''):
        break
    g = s.split()
    num = int(g[0])
    g.remove(g[0])
    l = []
    for i in range(num):
        l.append(int(g[i]))
    max_ = max(l)
    min_ = min(l)
    #print(max_,min_)
    l.remove(max_)
    l.remove(min_)
    sum_ = 0
    #print(g)
    for i in l:
        sum_ += int(i)
        #print(sum_)
    print('%.2f' % (sum_/(int(num)-2)))
