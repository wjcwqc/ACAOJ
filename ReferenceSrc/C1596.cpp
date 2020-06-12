#include<iostream>
#include<algorithm>
#include<cstring>
#define maxn 10005
using namespace std;
struct stu
{
	int x,y;
	int t;
};
stu mapp[maxn];
int f[1005];
int n,m,k,sum,flag;
bool cmp(stu x,stu y)
{
	return x.t<y.t;
}
int  dfs(int x)
{
	if(f[x]!=x) f[x]=dfs(f[x]);
	return f[x];
}
void build(int x)
{
	if(dfs(mapp[x].x)!=dfs(mapp[x].y))
	{
		f[dfs(mapp[x].x)]=dfs(mapp[x].y);
		sum+=mapp[x].t;
	}
}
int solve()
{
	int re=0;
	for(int i=1;i<=n;i++)
	{
		if(f[i]==i) re++;
	}
	if(re==k) return 1;
	else return 0;
}
int main()
{
	while(cin>>n>>m>>k)
	{
		for(int i=0;i<1005;i++) f[i]=i;
		sum=0;
		flag=0;
		for(int i=0;i<m;i++) cin>>mapp[i].x>>mapp[i].y>>mapp[i].t;
		sort(mapp,mapp+m,cmp);
		for(int i=0;i<m;i++)
		{
			build(i);
			if(solve())
			{
				flag=1;
				cout<<sum<<endl;
				break;
			}
		}
		if(!flag) cout<<"No Answer"<<endl;
	}
	return 0;
}