

#include <stdio.h>
#include <iostream>
#include <string>
#include <complex>

using namespace std;

string bin(long d){
    string r = "";
    while (d > 0) {
        if (d%2 == 0) {
            r = '0' + r;
        }else
            r = '1' + r;
        d /= 2;
    }
    return r;
}
int main(){
    long p;
    while (scanf("%ld", &p) != EOF) {
        string b = bin(p);
        
        complex<double> g(-1, 1);
        complex<double> r(0, 0);
        for (int i = 0; i < (int)b.length(); i++) {
            if(b[b.length()- 1 - i] == '1'){
                r += pow(g, i);
            }
        }
        printf("%.0f %.0f\n", r.real(), r.imag());
    }
    return 0;
}
