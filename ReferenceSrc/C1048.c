#include<stdio.h>
#include<math.h>
int yue(int m){
        int i,s=0;
     for(i=1;i<m;i++)
    {
    if(m%i==0)
    s+=i;
    }
     return s;
}
int main(){
     int cnt,i,a,x,y,b;
     scanf("%d",&cnt);
    for(i=0;i<cnt;i++)
    {
    scanf("%d%d",&a,&b);
    x=yue(a);y=yue(b);
    if(x==b&&y==a)
     printf("YES");
    else printf("NO");
    printf("\n");
    }
    return 0;
}