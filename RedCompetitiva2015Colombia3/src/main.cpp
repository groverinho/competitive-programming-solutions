#include <iostream>
#include <stdio.h>
#include <math.h>

using namespace std;

int main()
{
    long int s;
    while (scanf("%ld",&s)&&(s!=0))
    {
        double n=(-1+sqrt(1+(8*(s+1))))/(2);
        int ans=ceil(n);
        long int aux=0.5*ans*(ans+1);
        aux=aux-s;
        printf ("%ld ",aux);
        printf ("%d\n",ans);
    }
    return 0;
}
