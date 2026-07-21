#include <stdio.h>
typedef struct Product{
    int id;
    char name[50];
    float price;
    int quantity;
}prod;
prod product[100];
int count = 0;
void addProduct();
void displayProduct();
void searchProduct();
int main(){
    
}
void addProduct(){
    printf("%d",prod.id);
    scanf("%d", &prod.id);
    printf("%s",prod.name);
    scanf("%[^\n]s",&prod.name);
}