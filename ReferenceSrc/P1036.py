n = int(input())
s = 100
h = 50
for i in range(n-1):
    s += h*2
    h = h/2
print('%.4f' % s)
