#include <iostream>
#include <vector>       // std::vector
#include <algorithm>
using namespace std;

int main()
{
    int n ;
    cin>> n;
		while (n-->0) {
			int sett ;
			int peso ;
			cin>>sett>>peso;
			int vect [sett];
			for (int i = 0; i < sett; i++)
			{
				cin>>vect[i];
			}
			 std::vector<int> myvector (vect, vect+sett);
			 std::sort (myvector.begin(), myvector.end());
			int maxi =0;
			int pesos = 0;
			for (int i = 0; i < sett; i++)
			{
				pesos += myvector[i];
				if (pesos<peso)
				{
					maxi++;
				}
				if (pesos>peso)
				{
					break;
				}
			}
			 cout << maxi << endl;
		}

    return 0;
}
