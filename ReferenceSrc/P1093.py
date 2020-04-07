while True:
    string = input()
    if(string == ''):
        break
    s = string.split()
    max_ = int(s[0])
    for i in s:
        if(i == '0'):
            break
        if(int(i) >= max_):
            max_ = int(i)
    print(max_)
