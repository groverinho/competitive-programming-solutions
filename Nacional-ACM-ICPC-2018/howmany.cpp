#include <iostream>
#include <math.h>
#include <cmath>
#include <stdio.h>

using namespace std;

int main()
{
    int t;
     scanf ("%d",&t);
    double log2 = log10(2), log5 = log10(5), epsilon = 0.000001;

    while (t-- > 0) {
        int a,b;
         scanf ("%d%d",&a , &b);

        int res = (int) ceil(a*log2+b*log5+epsilon);
//cout << res << endl;
printf ("%d\n",res);
    }

    return 0;
}
