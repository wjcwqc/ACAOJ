#include<stdio.h>
int main()
{
 int a,b,c,sum;
 scanf("%d %d",&a,&b);
 sum=0;
    c=a;

 do
 {
  for(c=a;c<=b;c++)
  if (c%3==1&&c%5==3)
  {
   sum=sum+c;

  }

 }
 while(c<=b&&c>=a);

 printf("%d",sum);

 return 0;

}