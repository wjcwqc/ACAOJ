#include<stdio.h>
#include<string.h>
int main()
{
	int n,a[3],b[3],i;
	scanf("%d",&n);
	while(n--)
	{
		for(i=0;i<3;++i)
        scanf("%d",a+i);
		for(i=0;i<3;++i)
        scanf("%d",b+i);
		for(i=2;i>=0;--i)
		{
			a[i]+=b[i];
			if(i!=0&&a[i]>=60)
			{
				a[i]-=60;
				++a[i-1];
			}
		}
		for(i=0;i<2;++i)
		{
			printf("%d ",a[i]);
		}
		printf("%d\n",a[i]);
	}
}