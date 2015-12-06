#include <iostream>
#include <stdio.h>
using namespace std;
long long  gcd(long long  a, long long  b)
{
	return b==0 ? a : gcd(b, a % b);
}
int main()
{
long long  v1;
long long  d1;

long long  v2;
long long  d2;
int casos=0;
while(scanf("%lld%lld%lld%lld", &v1,&d1, &v2,&d2),v1 || d1||v2||d2)
{
    casos++;
    double t1 = (double)d1/v1;
    double t2 = (double)d2/v2;
    if (t2<t1)
    {
        printf("Case #%d: No beer for the captain.\n",casos);
    }
    else
        printf("Case #%d: You owe me a beer!\n",casos);
    long long numerador = (d1*v2) + (d2*v1);
    long long  den = 2 * v1 *v2;
    long long  total =  gcd(numerador,den);
    numerador = numerador/ total;
    den = den/ total;
    if(den ==1)
        printf("Avg. arrival time: %lld\n",numerador);
    else
        printf("Avg. arrival time: %lld/%lld\n",numerador,den);
}

    return 0;
}
