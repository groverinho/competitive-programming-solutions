#include <iostream>
#include <stdio.h>

using namespace std;

int main()
{
    int n, x, sum, ant;
    scanf("%d", &n);
    while(n--){
        sum = 0;
        ant = -1;
        while(scanf("%d", &x), x){
            if(ant == -1){
                ant = x;
            }else{
                if(x > 2*ant){
                    sum += x - 2*ant;
                }
                ant = x;
            }
        }
        printf("%d\n", sum);
    }
    return 0;
}
