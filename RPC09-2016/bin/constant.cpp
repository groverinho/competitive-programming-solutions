// A Dynamic programming based C++ program to find number of
// non-negative solutions for a given linear equation
#include<bits/stdc++.h>
using namespace std;

// Returns counr of solutions for given rhs and coefficients
// coeff[0..n-1]
long long countSol(int coeff[], int n, int rhs)
{
    // Create and initialize a table to store results of
    // subproblems
    long long dp[rhs+1];
    memset(dp, 0, sizeof(dp));
    dp[0] = 1;

    // Fill table in bottom up manner
    for (int i=0; i<n; i++)
      for (int j=coeff[i]; j<=rhs; j++)
         dp[j] += dp[j-coeff[i]];

    return dp[rhs];
}

// Driver program
int main()
{
    int a;
    cin>>a;
    int c=1;
    while(a-->0)
    {
    int coeff[8];
    for(int i=0;i<8;i++)
    {
        cin>>coeff[i];
    }
    int rhs;
    cin>>rhs;
    long long n = sizeof(coeff)/sizeof(coeff[0]);
    cout<<"Equation #"<<c<<": " << countSol(coeff, n, rhs)<<endl;
    c++;
    }

    return 0;
}
