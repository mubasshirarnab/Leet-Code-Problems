#include<iostream>

using namespace std;

bool isPerfectSquare(int num);

int main()
{
    int num;
    cout<<"Enter a number: ";
    cin>>num;

    if (isPerfectSquare(num) == 1)
    {
        cout<<"Perfect Square." << endl;
    }
    else{
        cout<< "Not a Perfect Square." << endl;
    }
    

    return 0;
}

bool isPerfectSquare(int num)
{
    int low = 0;
    long long high = num;

    while (low <= high)
    {
        long long mid = (low + high) / 2;
        long long temp = mid * mid;
        if (temp == num)
        {
            return true;
        }
        else if (temp > num)
        {
            high = mid - 1;
        }
        else
        {
            low = mid + 1;
        }
    }

    return false;
}