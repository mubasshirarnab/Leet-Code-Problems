#include<stdio.h>

int main()
{
    int n , a = 2, b = 3, sum;
    scanf("%d", &n);

    if (n==1 || n==2 || n==3)
    {
        printf("%d", n);
        return 0;
    }
    else{
        for (int i = 4; i <= n; i++)
        {
            sum = a + b;
            a = b;
            b = sum;
        } 
        printf("%d", sum); 
    }

   return 0; 
}