_str = "0123456789"
s = int(input())
for n in range(s):
    string = input()
    for i in range(len(string)):
        if( string[i] not in _str):
            string = string.replace(string[i]," ",1)
    string = string.replace(" ","")
    print(len(string))
