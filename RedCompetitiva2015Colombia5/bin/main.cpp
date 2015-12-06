#include <iostream>
#include <stdio.h>
using namespace std;

int main()
{
    int casos ;
    scanf ("%d",&casos);
		while (casos--)
		{
				long long llaves;
				long long casas;
			 scanf ("%lld",&llaves);
			  scanf ("%lld",&casas);
			long long cont=0;
			long long nf = casas-1;
			long long ni= casas - llaves;
			cont = (nf-ni+1)*(nf+ni)/2 ;
			 printf ("%lld\n",cont);
		}
    return 0;
}