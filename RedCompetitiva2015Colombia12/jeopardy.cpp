//
//  jeopardy.cpp
//  RPC
//
//  Created by Oscar Ruiz on 10/24/15.
//  Copyright © 2015 Oscar Ruiz. All rights reserved.
//
#include <iostream>
#include <stdio.h>
#include <string>
#include <vector>
using namespace std;
typedef enum {
    derecha,
    izquierda,
    arriba,
    abajo
}Direcciones;
typedef pair<int, int> ii;
typedef vector<ii> vii;
int main(){
    int tc, x, y, maxx=0, miny = 0, maxy=0, ancho, alto;
    string fila;
    cin >> tc;
    cin.ignore();
    printf("%d\n", tc);
    while (tc--) {
        getline(cin, fila);
        Direcciones dir = derecha;
        x = 0;
        y = 0;
        maxx = 0;
        maxy = 0;
        miny = 0;
        vii puntos;
        puntos.push_back(make_pair(x, y));
        for (int i = 0; i < fila.length(); i++) {
            switch (fila[i]) {
                case 'F':
                    switch (dir) {
                        case izquierda:
                            x--;
                            break;
                        case derecha:
                            x++;
                            break;
                        case arriba:
                            y--;
                            break;
                        case abajo:
                            y++;
                        default:
                            break;
                    }
                    break;
                case 'R':
                    switch (dir) {
                        case izquierda:
                            dir = arriba;
                            y--;
                            break;
                        case derecha:
                            dir = abajo;
                            y++;
                            break;
                        case arriba:
                            dir = derecha;
                            x++;
                            break;
                        case abajo:
                            dir = izquierda;
                            x--;
                        default:
                            break;
                    }
                    break;
                case 'L':
                    switch (dir) {
                        case izquierda:
                            dir = abajo;
                            y++;
                            break;
                        case derecha:
                            dir = arriba;
                            y--;
                            break;
                        case arriba:
                            dir = izquierda;
                            x--;
                            break;
                        case abajo:
                            dir = derecha;
                            x++;
                        default:
                            break;
                    }
                    break;
                case 'B':
                    switch (dir) {
                        case izquierda:
                            dir = derecha;
                            x++;
                            break;
                        case derecha:
                            dir = izquierda;
                            x--;
                            break;
                        case arriba:
                            dir = abajo;
                            y++;
                            break;
                        case abajo:
                            dir = arriba;
                            y--;
                        default:
                            break;
                    }
                    
                default:
                    break;
            }
            maxx = max(maxx, x);
            maxy = max(maxy, y);
            miny = min(miny, y);
            puntos.push_back(make_pair(x, y));
        }
        alto = maxy - miny + 3;
        ancho = maxx + 2;
        printf("%d %d\n", alto, ancho);
        bool esta;
        for (int i = miny-1; i < maxy + 2; i++) {
            for (int j = 0; j < ancho; j++) {
                esta = false;
                for (int k = 0; k < puntos.size(); k++) {
                    if (puntos[k].first == j && puntos[k].second == i) {
                        esta = true;
                        break;
                    }
                }
                if (esta) {
                    printf(".");
                }else
                    printf("#");
            }
            printf("\n");
        }
    }
}