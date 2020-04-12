n = int(input())
for i in range(n):

    s = input()
    first = int(s[0])
    result = s[0] + ' '
    for j in range(1,9):
        if(int(s[2*j])<first):
            result = s[2*j] + ' ' + result
        else:
            result += s[2*j] + ' '
    print(result[:-1])
