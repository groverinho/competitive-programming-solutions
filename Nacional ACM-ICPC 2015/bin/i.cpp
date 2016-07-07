
#include <iostream>
#include <vector>
#include <map>
#include <string>
#include <queue>
#include <functional>
#include <stdio.h>

using namespace std;

#define inf 2000000000

struct edge{
    int costo, tiempo, destino;
};

struct nodo{
    int costo, tiempo, planeta, paradas;
};

auto comp = [](const nodo &a, const nodo &t) -> bool {
    if(a.costo == t.costo){
        return a.tiempo > t.tiempo;
    }else{
        return  a.costo > t.costo;
    }
        
};
void dijkstra(vector<vector<edge>> grafo, int o, int d, int n){
    vector<int> cost(grafo.size(), inf);
    vector<int> time(grafo.size(), inf);
    vector<int> paradas(grafo.size(), 300);
    
    priority_queue<nodo, vector<nodo>, decltype(comp)> cola(comp);
    nodo u;
    u.costo = 0;
    u.planeta = o;
    u.paradas = 0;
    u.tiempo = 0;
    cola.push(u);
    nodo v;
    
    cost[o] = 0;
    time[o] = 0;
    
    bool sirve = false;
    
    while (!cola.empty()) {
        v = cola.top();
        cola.pop();
        
        if(v.paradas > n+1) continue; // mas de n paradas
        
        if (v.planeta == d) {
            printf("%d %d\n", v.costo, v.tiempo);
            sirve = true;
            break;
        }
        
        for (int i = 0; i < grafo[v.planeta].size(); i++) {
            edge e = grafo[v.planeta][i];
            if (cost[v.planeta] + e.costo < cost[e.destino]) {
                cost[e.destino] = cost[v.planeta] + e.costo;
                time[e.destino] = time[v.planeta] + e.tiempo;
                nodo w;
                w.planeta = e.destino;
                w.costo = v.costo + e.costo;//cost[e.destino];
                w.tiempo = v.tiempo + e.tiempo;//time[e.destino];
                w.paradas = v.paradas + 1;
                cola.push(w);
            }else if(cost[v.planeta] + e.costo == cost[e.destino]){
                if (time[v.planeta] + e.tiempo <= time[e.destino]) {
                    cost[e.destino] = cost[v.planeta] + e.costo;
                    time[e.destino] = time[v.planeta] + e.tiempo;
                    nodo w;
                    w.planeta = e.destino;
                    w.costo = v.costo + e.costo;//cost[e.destino];
                    w.tiempo = v.tiempo + e.tiempo;//time[e.destino];
                    w.paradas = v.paradas + 1;
                    cola.push(w);
                }
            }else if(paradas[e.destino] > v.paradas + 1){
                nodo w;
                w.planeta = e.destino;
                w.costo = v.costo + e.costo;//cost[e.destino];
                w.tiempo = v.tiempo + e.tiempo;//time[e.destino];
                w.paradas = v.paradas + 1;
                cola.push(w);
            }
        }
    }
    if (!sirve) {
        printf("* *\n");
    }
}

int main(int argc, const char * argv[]) {
    
    int p, f, q, i, si, n;
    bool primero = true;
    string str, origen, destino;
    while (scanf("%d%d%d", &p, &f, &q) != EOF) {
        
        if (primero) {
            primero = false;
        }else
            printf(".\n");
        
        cin.ignore();
        map<string, int> planetas;
        vector<vector<edge> > grafo(p, vector<edge>());
        for (i=0; i<p; i++) {
            cin >> str;
            planetas[str] = i;
        }
        for (i=0; i < f; i++) {
            edge e;
            cin >> origen >> destino >> e.costo >> e.tiempo;
            e.destino = planetas[destino];
            grafo[planetas[origen]].push_back(e);
        }
        cin >> origen;
        si = planetas[origen];
        
        vector<int> cost(p, inf);
        vector<int> time(p, inf);
        vector<int> paradas(p, inf);
        
        priority_queue<nodo, vector<nodo>, decltype(comp)> cola(comp);
        nodo u;
        u.costo = 0;
        u.planeta = si;
        u.paradas = 0;
        u.tiempo = 0;
        cola.push(u);
        nodo v;
        
        cost[si] = 0;
        time[si] = 0;
        paradas[si] = 0;
        
        while (!cola.empty()) {
            v = cola.top();
            cola.pop();
            
            if (v.costo > cost[v.planeta]) { // segun halim este check es importante
                continue;
            }else if(v.costo == cost[v.planeta]){
                if (v.tiempo > time[v.planeta]) {
                    continue;
                }
            }
            for (int i = 0; i < grafo[v.planeta].size(); i++) {
                edge e = grafo[v.planeta][i];
                if (cost[v.planeta] + e.costo < cost[e.destino]) {
                    cost[e.destino] = cost[v.planeta] + e.costo;
                    time[e.destino] = time[v.planeta] + e.tiempo;
                    paradas[e.destino] = paradas[v.planeta] + 1;
                    nodo w;
                    w.planeta = e.destino;
                    w.costo = cost[e.destino];
                    w.tiempo = time[e.destino];
                    w.paradas = v.paradas + 1;
                    cola.push(w);
                }else if(cost[v.planeta] + e.costo == cost[e.destino]){
                    if (time[v.planeta] + e.tiempo <= time[e.destino]) {
                        cost[e.destino] = cost[v.planeta] + e.costo;
                        time[e.destino] = time[v.planeta] + e.tiempo;
                        paradas[e.destino] = paradas[v.planeta] + 1;
                        nodo w;
                        w.planeta = e.destino;
                        w.costo = cost[e.destino];
                        w.tiempo = time[e.destino];
                        w.paradas = v.paradas + 1;
                        cola.push(w);
                    }
                }
            }
        }
        
        int d;
        for (i=0; i<q; i++) {
            cin >> destino >> n;
            d = planetas[destino];
            if (cost[d] == inf) {
                printf("* *\n");
            }else if(paradas[d] <= n+1){
                printf("%d %d\n", cost[d], time[d]);
            }else{
                dijkstra(grafo, si, d, n);
            }
        }
    }
    return 0;
}
 
