#include<iostream>

using namespace std;

int maxArea(int* height, int heightSize);

int main()
{
    int n;
    cin >> n;
    int height[n];

    for (int i = 0; i < n; i++)
    {
        cin >> height[i];
    }

    cout << maxArea(height, n);

    return 0;
}

int maxArea(int* height, int heightSize) {
    int max = 0, water;
    int left = 0, right = heightSize - 1;

    while (left < right) {
        int h_left = height[left];
        int h_right = height[right];
        int width = right - left;

        if(h_left > h_right){
            water = h_right * width;
        }
        else{
            water = h_left * width;
        }

        if (water > max) {
            max = water;
        }

        if (h_left < h_right) {
            left++;
        } else {
            right--;
        }
    }

    return max;
}
