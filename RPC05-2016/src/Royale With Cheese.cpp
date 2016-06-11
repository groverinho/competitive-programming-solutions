#include <bits/stdc++.h>

using namespace std;

int main()
{
    string cad;
    while (cin>>cad)
    {
        map <char, int> mapa;
        map <char, int> ::iterator it;
        int con = 1;
        string res = "";
        for (long int q = 0; q < cad.length(); q++)
        {
            if (!mapa.count(cad[q]))
            {
                mapa[cad[q]] = con;
                con++;
            }
            int val = mapa[cad[q]];
            int a = val/10;
            int b = val%10;
            //cout<<"vad " <<val;
            if (a != 0)
            {
                val = a;
                if (val == 2 || val == 5)
                {
                    val = abs(val - 7);
                }
                else if (val == 6 || val == 9)
                {
                    val = abs(val - 15);
                }
                cout<<val;
            }
            val = b;

            //cout<<"1 "<<val<<endl;
            if (val == 2 || val == 5)
            {
                val = abs(val - 7);
            }
            else if (val == 6 || val == 9)
            {
                val = abs(val - 15);
            }
            cout<<val;
            //cout<<a<<" "<<b<<endl;
        }
        cout<<endl;
    }
    return 0;
}
