#include<stdio.h>
int main()
{
	int i,j,t,a,m,n,b;
	char c[40][40];
	scanf("%d",&n);
	for(t=0;t<n;t++)
	{
		scanf("%d%d",&a,&b);
		for(i=0;i<a;i++)
			for(j=0;j<a;j++)
				c[i][j]=' ';
		for(i=0,j=0;i<a;i++,j++)
			c[i][i]='X';
		for(i=a-1,j=0;i>=0;i--,j++)
			c[i][j]='X';
		for(m=0;m<b-1;m++)
		{
			for(i=0;i<a-1;i++)
			{
				for(j=0;j<a;j++)
					printf("%c",c[i][j]);
				printf("\n");
			}
		}
		for(i=0;i<a;i++)
		{
				for(j=0;j<a;j++)
					printf("%c",c[i][j]);
				printf("\n");
		}
		printf("\n");

	}
}