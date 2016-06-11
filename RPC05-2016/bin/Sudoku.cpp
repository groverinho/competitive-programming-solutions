#include <bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    cin>>t;
    while (t--)
    {
        int n;
        cin>>n;
        int mat[n][n];
        for (int q = 0; q <n; q++)
        {
            for (int w = 0; w < n; w++)
            {
                cin>>mat[q][w];
            }
        }
        bool vec[n];
        bool aux = true;
        for (int q = 0; q < n; q++)
        {
            for (int qq = 0; qq < n; qq++)
            {
                vec[qq] = false;
            }
            for (int w = 0; w < n; w++)
            {
                if (vec[mat[q][w]-1])
                {
                    q = n;
                    w = n;
                    aux = false;
                }
                else
                {
                    vec[mat[q][w]-1] = true;
                }
            }
        }
        if (aux)
        {
            for (int q = 0; q < n; q++)
            {
                for (int qq = 0; qq < n; qq++)
                {
                    vec[qq] = false;
                }
                for (int w = 0; w < n; w++)
                {
                    if (vec[mat[w][q]-1])
                    {
                        q = n;
                        w = n;
                        aux = false;
                    }
                    else
                    {
                        vec[mat[w][q]-1] = true;
                    }
                }
            }
        }
        if (aux)
        {
            int posx = 0;
            int posy = 0;
            int aum = sqrt(n);
            while (posy < n && aux)
            {
                posx = 0;
                while (posx < n && aux)
                {
                    for (int qq = 0; qq < n; qq++)
                    {
                        vec[qq] = false;
                    }
                    for (int q = posy; q < posy+aum; q++)
                    {
                        for (int w = posx; w < posx+aum; w++)
                        {
                            if (vec[mat[q][w]-1])
                            {
                                q = n;
                                w = n;
                                aux = false;
                            }
                            else
                            {
                                vec[mat[q][w]-1] = true;
                            }
                        }
                    }
                    posx += aum;
                }
                posy += aum;
            }
        }
        if (aux)
        {
            cout<<"yes"<<endl;
        }
        else
        {
            cout<<"no"<<endl;
        }
    }
    return 0;
}
