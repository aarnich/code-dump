	#include<iostream>
	using namespace std;
    static int factorial(int n){
        if (n == 1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
	int main()
	{
        int factorialLimit;
        cout << "How big is your factorial";
        cin >> factorialLimit;
        cout << factorial(factorialLimit);
        return 0;
	}