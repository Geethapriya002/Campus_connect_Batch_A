#include <stdio.h>
#include<iostream>
#include<stdlib.h>
using namespace std;
//sigle inheritence
class abc
{
    public :
    void operations(int a,int b)
    {
        cout<<a+b<<std::endl;
    }
   
};
//abcd is child class
class abcd :public class abc
{
    public :
    void operation(int a,int b)
    {
        cout<<abs(a-b)<<std::endl;
    }
   
};

class abcde :public class abcs
{
    public :
    void operate(int a,int b)
    {
        cout<<abs(a-b)<<std::endl;
    }
   
};
int main()
{
    
   abcd it;
   it.operate(23,13);
   it.operation(5,6);
   it.operations(15,7);
}