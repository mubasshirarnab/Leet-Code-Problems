#include<iostream>

using namespace std;

void sortColors(int *Arr, int n){
    int i,j,temp;

    for ( i = 1; i < n; i++)
    {
        temp = Arr[i];
        j = i-1;

        while (j >= 0 && Arr[j]>temp)
        {
            Arr[j+1] = Arr[j];
            j--;
        }
        Arr[j+1] = temp;
        
    }
    
}

void printArray(int *Arr, int n){
    for (int i = 0; i < n; i++)
    {
        cout << Arr[i] << " ";
    }
    
}

int main()
{
    int arr[]{2,0,2,1,1,0};

    sortColors(arr, 6);
    printArray(arr,6);

    return 0;
}