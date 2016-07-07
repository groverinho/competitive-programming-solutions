

#include <stdio.h>
#include <iostream>
#include <string>
#include <vector>
#include <cstring>


using namespace std;

typedef vector<int> VI;

#define MAX_N 400010
char T[MAX_N], P[MAX_N];
int b[MAX_N], n, m;

void kmpPreprocess(){
    int i = 0, j = -1; b[0] = -1;
    while (i < m) {
        while(j >= 0 && P[i] != P[j]) j = b[j];
        i++; j++;
        b[i] = j;
    }
}
int kmpSearch(){
    int i = 0, j = 0;
    int c = 0;
    while (i < n) {
        while(j >= 0 && T[i] != P[j]) j = b[j];
        i++; j++;
        if (j == m) {
            c++;
            j = b[j];
        }
    }
    return c;
}

string convertir(string a){
    string r = "";
    bool en=false, enc=false;
    for (int i = 0; i < a.length(); i++) {
        if (a[i] >= '0' && a[i] <= '9') {
            en = true;
        }else if (a[i] == '(' || a[i] == ')'){
            if (en) {
                r.append(1, '0');
                en = false;
            }
            if (enc) {
                r.append(1, '0');
                enc = false;
            }
            r.append(1,a[i]);
        }else if (a[i] >= 'a' && a[i] <= 'z'){
            enc = true;
        }else{
            if (en) {
                r.append(1, '0');
                en = false;
            }
            if (enc) {
                r.append(1, '0');
                enc = false;
            }
            r.append(1, '*');
        }
    }
    if (en) {
        r.append(1, '0');
        en = false;
    }
    if (enc) {
        r.append(1, '0');
        enc = false;
    }
    return r;
}

int main(){
    string str1, str2, a, b;
    while (getline(cin, str1)) {
        getline(cin, str2);
        a = convertir(str1);
        b = convertir(str2);
        
        if (b.length() < a.length()) {
            cout << 0 << endl;
        }else{
            strcpy(T, b.c_str());
            strcpy(P, a.c_str());
            m = (int)a.length();
            n = (int)b.length();
            kmpPreprocess();
            cout << kmpSearch() << endl;
        }
    }
    return 0;
}

