#include<iostream>
#include <list>
#include <limits.h>
#include <map>
#include <vector>
using namespace std;
typedef pair<int, int> ii;
class Graph
{
    int V;    // No. of vertices
    list<int> *adj;    // Pointer to an array containing adjacency lists
    bool isCyclicUtil(int v, bool visited[], bool *rs);  // used by isCyclic()
public:
    Graph(int V);   // Constructor
    void addEdge(int v, int w);   // to add an edge to graph
    bool isCyclic();    // returns true if there is a cycle in this graph
};
Graph::Graph(int V)
{
    this->V = V;
    adj = new list<int>[V];
}
void Graph::addEdge(int v, int w)
{
    adj[v].push_back(w); // Add w to v’s list.
}
bool Graph::isCyclicUtil(int v, bool visited[], bool *recStack)
{
    if(visited[v] == false)
    {
        // Mark the current node as visited and part of recursion stack
        visited[v] = true;
        recStack[v] = true;

        // Recur for all the vertices adjacent to this vertex
        list<int>::iterator i;
        for(i = adj[v].begin(); i != adj[v].end(); ++i)
        {
            if ( !visited[*i] && isCyclicUtil(*i, visited, recStack) )
                return true;
            else if (recStack[*i])
                return true;
        }

    }
    recStack[v] = false;
    return false;
}
bool Graph::isCyclic()
{

    bool *visited = new bool[V];
    bool *recStack = new bool[V];
    for(int i = 0; i < V; i++)
    {
        visited[i] = false;
        recStack[i] = false;
    }
    for(int i = 0; i < V; i++)
        if (isCyclicUtil(i, visited, recStack))
            return true;

    return false;
}

int main()
{
    int casos ;
    cin>>casos;
    map<string,int> mapa ;
    int index=0;
    int aux1,aux2;
    int c = 0;
    vector<ii> v;
    for(int i =0; i<casos;i++)
    {

            string n1,signo ,n2;
            cin>>n1>>signo>>n2;
            if(mapa.find(n1)==mapa.end())
            {
                aux1 = c;
                mapa[n1]=aux1;
                c++;
            }
            else
            {
                aux1 = mapa[n1];
            }

            if(mapa.find(n2) ==mapa.end())
            {
                aux2 = c;
                mapa[n2]=aux2;
                c++;
            }
            else
            {
                aux2 = mapa[n2];
            }
            if(signo==">")
            {
                 v.push_back(ii(aux1, aux2));
            }
            else{
                 v.push_back(ii(aux2, aux1));
            }

     }
    Graph g(c);
    for(int i = 0; i < v.size(); i++){
        g.addEdge(v[i].first, v[i].second);
    }

    if(g.isCyclic())
        cout << "impossible"<<endl;
    else
        cout << "possible"<<endl;
    return 0;
    }
