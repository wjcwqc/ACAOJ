while True:
    string = input()
    if(string == ''):
        break
    num = int(string)
    num_2 = bin(num)
    num_2 = num_2.replace('0b','')
    print(str(num) + '-->' + num_2)
