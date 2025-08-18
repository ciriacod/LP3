#include <iostream>
#include <vector>
using namespace std;

int SumaArreglo (vector<int> arreglo){
    int sum = 0;
    for (int i: arreglo){
        sum += i;
    }
    return sum;
}

int main(){
    vector <int> arr = {1,2,3,4,5};
    cout << "La suma de los elementos del arreglo es: " << SumaArreglo(arr) << endl;
    return 0;
}