#include <iostream>
#include <stdio.h>
using namespace std;

int main()
{
    int n ;
    //cin>> n;
    scanf ("%lld",&n);
		while(n!=0)
		{
			long long k ;
			//cin>>k;
            scanf ("%lld",&k);
			long long aux = (k*(k+1))/2;
			for (int i = 0; i < k-1; i++)
			{
			    long long f ;
             //   cin>>f;
             scanf ("%lld",&f);
				aux-=f;
			}
          // cout << aux<<endl;
          printf ("%lld\n",aux);
			n--;
		}


    return 0;
}