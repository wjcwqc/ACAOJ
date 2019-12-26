#include<stdio.h>
#include<math.h>
int pd(int x)
{
int i;
if ( x == 2) return 1;
for( i = 2; i <= sqrt(x); i++)
if( x % i == 0) return 0;
return 1;
}
int main()
{
int num;
while(scanf("%d",&num) == 1)
{
int i, sum = 0;
for( i = 2; i <= num / 2; i++)
if( pd(i) && pd(num - i)) sum++;
printf("%d\n",sum);
}
return 0;
}