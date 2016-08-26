#include <iostream>
#include <stdio.h>

using namespace std;

int main()
{
    int n, x;
    scanf("%d", &n);
    int a, b, c, a1, b1, c1;

    while(n--){
       bool color = false, cant = false;
            scanf("%d%d%d%d%d%d", &a, &b, &c, &a1, &b1, &c1);
            printf("%d %d %d %d %d %d\n", a, b, c, a1, b1, c1);
        if(a + b + c > a1 + b1 + c1){
            cant = true;
        }
        if(a == a1){
            if(b == b1){
                if(c > c1){
                    color = true;
                }
            }else if(b > b1)
                color = true;
        }else if(a > a1)
            color = true;


        if(color && cant)
            printf("both\n");
        else if(color)
            printf("color\n");
        else if(cant)
            printf("count\n");
        else
            printf("none\n");

    }
       return 0;
}
