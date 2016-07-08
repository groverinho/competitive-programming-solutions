//============================================================================
// Name        : latinoCPP.cpp
// Author      : Death Machine :)
// Version     :
// Copyright   : UPDS TARIJA
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <stdio.h>
using namespace std;
/*
5 3
300 10 100 10 1 10
1100 100 10 100 1 1000
1200 100 100 10 1 1000
*/
int main() {
	int n, m, b;
	scanf("%d%d", &n, &m);
	int puntos[n];
	int puntosGanados = 0, puntosMaximos = 0, sum = 0, aux;
	int cartas[5] = {1, 10, 100, 1000, 10000};
	for (int i  = 0; i  < m; ++i ) {
		scanf("%d", &b);
		sum = 0;
		for (int j = 0; j < n; ++j) {
			if(j == 0) {
				scanf("%d", &puntosGanados);
			}else{
				scanf("%d", &aux);
				sum += aux;
			}
		}
		if(sum >= b){
			// no gana nada
			puntosGanados = 0;
		}else{
			if(sum + puntosGanados > b){
				puntosGanados = 0;
			}
			for(int k = 4; k >= 0; k--){
				if(sum + cartas[k] <= b){
					// victoria
					aux = cartas[k] - puntosGanados;
					puntosMaximos += aux;
					break;
				}
			}
		}
	}
	printf("%d\n", puntosMaximos);
	return 0;
}
