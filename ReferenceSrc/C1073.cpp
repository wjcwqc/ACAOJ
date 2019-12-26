#include<bits/stdc++.h>
using namespace std;
int main()
  {
      int n, ans, sum = 0;
     cin>>n;
      for (int i = 1; i <= n; i++)
          for (int j = 2; j < n; j += 2)
              for (int k = 5; k < n; k += 5)
             {
                 ans = i + j + k;
                 if (ans == n)                 {
                    sum++;
                     break;
                }
             }
     cout<<sum<<endl;
     return 0;
 }