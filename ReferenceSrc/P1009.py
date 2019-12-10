while 1:
    s = input()
    if(s == ""):
        break
    result = 0
    for i in range(len(s)):
        result += int(s[i])
    print(result)
