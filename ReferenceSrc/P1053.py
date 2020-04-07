daxie = 'QWERTYUIOPLKJHGFDSAZXCVBNM'
xiaoxie = 'qwertyuioplkjhgfdsazxcvbnm'
number = '0123456789'
special = '~,!,@,#,$,%,^;'
def level(pw):
    level_1,level_2,level_3,level_4= 0,0,0,0
    for i in range(len(pw)):
        if (pw[i] in daxie):
            level_1 = 1
        elif(pw[i] in xiaoxie):
            level_2 = 1
        elif(pw[i] in number):
            level_3 = 1
        elif (pw[i] in special):
            level_4 = 1
    if((level_1 + level_2 + level_3 + level_4) >=3):
        print('YES')
    else:
        print('NO')

num = int(input())

for i in range(num):
    level(input())
