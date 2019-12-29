#include <iostream>
using namespace std;
int main()
{
    int S = 0;
    int n;
    cin>>n;
    if(n>24)n=24;
    int MOD = 1000000;
    for(int i = 1; i <= n; i++)
    {
        int factorial = 1;
        for(int j = 1 ; j <= i; j++)
            //进行取余
            factorial = factorial*j%MOD;
        //进行取余
        S = (S + factorial)%MOD;
    }
    cout<<S;
    return 0;
}