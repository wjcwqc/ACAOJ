import sys,os,re

cnt=0
dir='./'
list=os.listdir(dir)
if len(list)>1:
    for i in range(0,len(list)):
        path=os.path.join(dir,list[i])
        if path.find('.java')!=-1&&path.find('P')!=-1:
            
            f=file(path,'rb')
            new_file=file('.%s.bak' % file_name,'wb')#文件名以.开头的文件是隐藏文件
            for line in f.xreadlines():#f.xreadlines()返回一个文件迭代器，每次只从文件（硬盘）中读一行
                new_file.write(line.replace(old_text,"Main"))
            f.close()
            
