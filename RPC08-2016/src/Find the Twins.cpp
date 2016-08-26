#include <iostream>
#include<stdio.h>
#include <string>
using namespace std;

int main()
{
    int t, x;
    scanf("%d", &t);
    string r;

    while(t--){
            r = "";
            bool zack = false, mack = false;
        for(int i = 0; i < 10; i++){

            scanf("%d", &x);
            if(i == 9){
                 printf("%d", x);
            }else
            printf("%d ", x);

            if(x == 17){
                r = "zack";
                zack = true;
            }else if(x == 18){
                r = "mack";
                mack = true;
            }
        }
        printf("\n");
        if(r == ""){
            printf("none\n");
        }else{
            if(zack && mack){
                printf("both\n");
            }else
            printf("%s\n", r.c_str());
        }
    }
       return 0;
}
