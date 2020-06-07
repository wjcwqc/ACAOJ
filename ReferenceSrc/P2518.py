#  Copyright (c) 2020. wjcwqc.All rights reserved.
#  License:GNU Public License
#  Project name:ACAOJ
#  Auther:wjcwqc
#  Date:2020/5/31 下午6:54

def f(apple,disk):
    if(apple<1 or disk==1):
        result=1
    elif(apple<disk):
        result=f(apple,apple)
    else:
        result=f(apple-disk,disk)+f(apple,disk-1)
    return result
if __name__ == '__main__':
    num=eval(input())
    # var Q[][]= int[30][30]
    for i in range(0,num):
        str=input().split(" ")
        m=eval(str[0])
        n=eval(str[1])
        print(f(m,n))

