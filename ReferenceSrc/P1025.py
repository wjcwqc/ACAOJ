x = 0
num = input()
for i in range(1,10000000):
    x += 1/(i*i)
pi = pow(6*x,1/2)
if(num == '1'):
    print('%.1f' % pi)
elif(num == '2'):
    print('%.2f' % pi)
elif(num == '3'):
    print('%.3f' % pi)
elif(num == '4'):
    print('%.4f' % pi)
elif(num == '5'):
    print('%.5f' % pi)
elif(num == '6'):
    print('%.6f' % pi)
elif(num == '7'):
    print('%.7f' % pi)
elif(num == '8'):
    print('%.8f' % pi)
