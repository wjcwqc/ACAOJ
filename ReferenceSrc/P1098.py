def pailie(head="",string=""):
    global result
    if len(string)>1:
        for num,father_string in enumerate(string):
            if father_string in string[0:num]:#如果字符与前面的重复说明排过顺序了
                continue
            pailie(head+father_string,string.replace(father_string,"",1))#只能替换一次
    else:
        result += 1
        #print(head+string)
input()
s = input()
result = 0
pailie(string= s)
print(result)
