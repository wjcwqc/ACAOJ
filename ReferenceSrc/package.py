#!/usr/bin/env python
#_*_ coding:utf-8 _*_
import sys,os,re
if len(sys.argv)<4 or len(sys.argv)>5:
 sys.exit('There needs four or five parameters')
elif len(sys.argv)==4:
 print 'usage:./file_replace.py old_text new_text filename'
else:
 print 'usage:./file_replace.py old_text new_text filename --bak'
old_text,new_text=sys.argv[1],sys.argv[2]
file_name=sys.argv[3]
f=file(file_name,'rb')
new_file=file('.%s.bak' % file_name,'wb')#文件名以.开头的文件是隐藏文件
for line in f.xreadlines():#f.xreadlines()返回一个文件迭代器，每次只从文件（硬盘）中读一行
 new_file.write(line.replace(old_text,new_text))
f.close()
new_file.close()
if '--bak' in sys.argv: #'--bak'表示要求对原文件备份
 os.rename(file_name,'%s.bak' % file_name) #unchanged
 os.rename('.%s.bak' % file_name,file_name) #changed
else:
 os.rename(file_name,'wahaha.txt')#此处也可以将原文件删除，以便下一语句能够正常执行
 os.rename('.%s.bak' % file_name,file_name)



zifu = ['<audio id="','" url="','"></audio>']
count = 0
rootdir = '.\'
list = os.listdir(rootdir)                      #列出文件夹下所有的目录与文件
for i in range(0,len(list)):
    path = os.path.join(rootdir,list[i])
    if os.path.isfile(path):

        if path.find('mp3') != -1:
            count = count + 1
            xiabiao = path.find("audio")
            newstr = path[xiabiao:len(path)]
            path = zifu[0] + str(count) + zifu[1] + newstr + zifu[2]
            print(path)
        else:
            # print("该文件不是MP3格式：%s"%path)
            pass