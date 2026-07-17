#include <stdio.h>

int main()
{
   int i,n;
   int sum = 0;
   scanf("%d", &n);
   int a[n];
   for(i=0;i<n;i++ ){
    scanf("%d", &a[i]);
    sum+= a[i];
   }
 
   for(i=0;i<n;i++){
       sum-= a[i];
       a[i] = sum;
        printf("%d ", a[i]);
   }
  
   
   

    return 0;
}