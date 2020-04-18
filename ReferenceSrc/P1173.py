'''
1 2 4 8 16 32 64 128 256 512 1024
24
23 22 20 16 8 8 7'''
n = int(input())#17
i = 2
cha = abs(n-4)
while True:
    i+=1
    if(cha <= abs(n-(2**i))):
        print(2**(i-1))
        break
    cha = abs(n-(2**i))
