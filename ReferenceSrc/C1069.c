#include<stdio.h>
int main()
 {
    int a, b,i;
    double jieguo;
    int at[12];                                //定义一个数组存放数字



        while(scanf("%d/%d",&a,&b)!=EOF)          //实现多组输入
        {
            jieguo= (double) a / b;               //进行强制类型转换
             printf(".");


            for (i = 0; i <= 10; i++)              //开始转换（逐步乘三）
            {
                jieguo *= 3;
                at[i] = (int) jieguo;
                jieguo -= at[i];
            }


            if (at[10] == 2)                       //进制
                at[9]++;

            for (i = 9; i >= 0; i--)                //满3进1
            {
                if (at[i] == 3)
                {
                    at[i] = 0;
                    at[i - 1]++;
                }
            }


        for (i = 0; i < 10; i++)                  //输出
            printf("%d", at[i]);

        printf("\n");
    }
    return 0;                                //结束程序
}