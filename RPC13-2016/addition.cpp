
#include <iostream>
#include <stdio.h>
#include <string>
#include <math.h>
#include <iomanip>
#include <bitset>
#include <vector>
#include <algorithm>
#include <queue>

using namespace std;

typedef long long ll;
typedef pair<int, int> ii;
char stringsAnumero(vector<string> arr){
    char resp = '0';
    if (arr[0] == "xxxxx") {
        // puede cer  2 o 3 o 5 o 6 o 7
        if (arr[1] == "x...x") {
            // es 0 o 8 o 9
            if(arr[3] == "x...x"){
                resp = '0';
            }else{
                // es 8 o 9
                if(arr[4] == "x...x"){
                    resp = '8';
                }else
                    resp = '9';
            }
        }else{
            if (arr[2] == "....x") {
                // es dos o tres o 7
                if (arr[4] == "....x") {
                    if (arr[3] == "....x") {
                        resp = '7';
                    }else{
                        resp = '3';
                    }
                }else{
                    resp = '2';
                }
            }else{
                // es 5 o 6
                if (arr[4] == "....x") {
                    resp = '5';
                }else{
                    resp = '6';
                }
            }
        }
    }else{
        // puede ser 1 o 4 o +
        if (arr[0] == "....x") {
            resp = '1';
        }else if (arr[0] == "x...x")
            resp = '4';
        else
            resp = '+';
        //printf("%s\n", arr[0].c_str());
    }
    return resp;
}


int main(int argc, const char * argv[]) {
    string fila;
    vector<string> matrix(7);
    while (getline(cin, fila)) {
        matrix[0] = fila;
        for (int i = 1; i < 7; i++) {
            getline(cin, fila);
            matrix[i] = fila;
        }
        int indice = 0, largo = 5;
        string r1 = "", r2 = "";
        bool primero = true;
        while (indice + largo <= fila.size()) {
            vector<string> caracter(7);
            for (int j = 0; j < 7; j++) {
                caracter[j] = matrix[j].substr(indice, largo);
            }
            char num = stringsAnumero(caracter);
            if (num == '+') {
                primero = false;
            }else{
                if (primero) {
                    r1 += num;
                }else
                    r2 += num;
            }

            indice += 6;
        }

        int n1 = atoi(r1.c_str());
        int n2 = atoi(r2.c_str());

        int resp = n1 + n2;
        string str = to_string(resp);

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < str.length(); j++) {
                switch (str[j]) {
                    case '0':
                        if (i == 0 || i == 6) {
                            printf("xxxxx");
                        }else
                            printf("x...x");
                        break;
                    case '1':
                        printf("....x");
                        break;
                    case '2':
                        if (i == 0 || i == 3 || i == 6) {
                            printf("xxxxx");
                        }else if(i == 1 || i == 2){
                            printf("....x");
                        }else {
                            printf("x....");
                        }
                        break;
                    case '3':
                        if (i == 0 || i == 3 || i == 6) {
                            printf("xxxxx");
                        }else if(i == 1 || i == 2){
                            printf("....x");
                        }else {
                            printf("....x");
                        }
                        break;
                    case '4':
                        if (i == 3) {
                            printf("xxxxx");
                        }else if(i < 3){
                            printf("x...x");
                        }else {
                            printf("....x");
                        }
                        break;
                    case '5':
                        if (i == 0 || i == 3 || i == 6) {
                            printf("xxxxx");
                        }else if(i == 1 || i == 2){
                            printf("x....");
                        }else {
                            printf("....x");
                        }
                        break;
                    case '6':
                        if (i == 0 || i == 3 || i == 6) {
                            printf("xxxxx");
                        }else if(i == 1 || i == 2){
                            printf("x....");
                        }else {
                            printf("x...x");
                        }
                        break;
                    case '7':
                        if (i == 0) {
                            printf("xxxxx");
                        }else {
                            printf("....x");
                        }
                        break;
                    case '8':
                        if (i == 0 || i == 3 || i == 6) {
                            printf("xxxxx");
                        }else {
                            printf("x...x");
                        }
                        break;
                    case '9':
                        if (i == 0 || i == 3 || i == 6) {
                            printf("xxxxx");
                        }else if(i == 1 || i == 2){
                            printf("x...x");
                        }else {
                            printf("....x");
                        }
                        break;
                    default:
                        break;
                }
                if (j < str.length() - 1) {
                    printf(".");
                }
            }
            printf("\n");
        }
    }
    return 0;
}

/*
....x   xxxxx   xxxxx
....x   ....x   ....x
....x   ....x   ....x
....x   xxxxx   xxxxx
....x   x....   ....x
....x   x....   ....x
....x   xxxxx   xxxxx
xxxxx.xxxxx.xxxxx.xxxxx.......xxxxx
x.........x.x...x.x...x...x...x...x
x.........x.x...x.x...x...x...x...x
xxxxx.....x.xxxxx.xxxxx.xxxxx.x...x
x...x.....x.x...x.....x...x...x...x
x...x.....x.x...x.....x...x...x...x
xxxxx.....x.xxxxx.xxxxx.......xxxxx

xxxxx.......xxxxx
x...x...x...x...x
x...x...x...x...x
x...x.xxxxx.x...x
x...x...x...x...x
x...x...x...x...x
xxxxx.......xxxxx




 ..x..
 .....
 */

