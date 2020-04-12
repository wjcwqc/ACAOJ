while True:
    string = input()
    if(string == '0 0'):
        break
    a,b = int(string.split()[0]),int(string.split()[1])
    print(int((a+b)*(b-a+1)/2))
