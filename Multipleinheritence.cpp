#include <iostream>
using namespace std;
class abc{
    public:
    void operations(int a,int b)
    {
        cout<<a+b<<std::endl;
    }
};
class abcd :public abc{
    public:
    void operation(int a,int b)
    {
        cout<<abs(a-b)<<std::endl;
    }
};
class abcs : public abc, public abcd{
    public:
    void operate(int a,int b)
    {
        cout<<abs(a-b)<<std::endl;
    }
};
int main(){
    abcs it;
    it.operations(10,3);
    it.operation(15,7);
    it.operate(5,6);    
    return 0;
}
   