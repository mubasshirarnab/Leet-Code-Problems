#include<iostream>

using namespace std;

void evenNumsFirstt(int *arr, int n){
    int i,j,temp;

    for ( i = 1; i < n; i++)
    {
        temp = arr[i];
        j = i-1;

        while (j >= 0 && arr[j]%2 == 1)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = temp;
        
    } 
}

void printArray(int *arr, int n){
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
    
}

int main()
{
    int arr[]={3,1,2,4};

    evenNumsFirstt(arr, 4);
    printArray(arr, 4);

    return 0;
}