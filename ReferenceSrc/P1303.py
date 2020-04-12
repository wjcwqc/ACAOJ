s = input().split()
a,b = s[0],s[1]
if(len(a)==1):
    a = '0'+a
if(len(b)==1):
    b = '0'+b
gewei = (int(a[1])+int(b[1]))%10
shiwei = (int(a[0])+int(b[0]))%10
print(shiwei*10 + gewei)
