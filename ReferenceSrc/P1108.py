while 1 :
    string = input()
    if(string == ''):
        break
    gread = int(string)
    if(90<=gread<=100):
        print('A')
    elif(80<=gread<=89):
        print('B')
    elif(70<=gread<=79):
        print('C')
    elif(60<=gread<=69):
        print('D')
    elif(0<=gread<=59):
        print('E')
    else:
        print('Score is error!')
