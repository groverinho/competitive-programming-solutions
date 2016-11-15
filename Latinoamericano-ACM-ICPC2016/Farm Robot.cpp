#include <iostream>
#include  <stdio.h>
#include <algorithm>
#include <vector>
#include <string>
#include <sstream>
#include <iterator>
#include <queue>
#include <stack>

using namespace std;

int main()
{
    int a, b, c, x, con, pos;
    while(scanf("%d%d%d", &a, &b, &c) != EOF){
        con = 0; pos = 1;
        if(c == 1) con = 1;
        for(int i = 0; i < b; i++){
            scanf("%d", &x);
            pos += x;
            if(pos > a){
                pos = 1;
            }
            if(pos < 1) pos = a;
            if(pos == c) con++;
        }
        printf("%d\n", con);
    }
    return 0;
}
