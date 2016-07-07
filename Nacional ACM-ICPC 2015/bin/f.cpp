
#include <stdio.h>
#include <iostream>
using namespace std;

int main(){
    int N, suma, sx, sy, *w, *x, *y;
    
    while (scanf("%d", &N) != EOF) {
        suma = 0;
        sx=0;
        sy=0;
        w = new int[N];
        x = new int[N];
        y = new int[N];
        for (int i = 0; i < N; i++) {
            scanf("%d%d%d", &x[i], &y[i], &w[i]);
            suma += w[i];
            sx += 2*w[i]*x[i];
            sy += 2*w[i]*y[i];
        }
        double rx = (double)sx / (2.0*suma);
        double ry = (double)sy / (2.0*suma);
        double r = 0;
        for (int i = 0; i < N; i++) {
            r += w[i]*((x[i] - rx)*(x[i] - rx) + (y[i] - ry)*(y[i] - ry));
        }
        printf("%.3f\n", r);
    }
}
 
