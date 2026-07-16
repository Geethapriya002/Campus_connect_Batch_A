#include <stdio.h>
int main(){
int i,j,n;
scanf("%d",&n);
for(i=0;i<n;i++){
    printf("\n");
    for(j=i+1;j<=n;j++){
        printf("* ");
    }
}
   

    return 0;
}