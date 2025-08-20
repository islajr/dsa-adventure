#include <iostream>
using namespace std;


int main() {
    const int SIZE = 5;
    int arr[SIZE] = {1, 2, 3, 4, 5};

    cout << "array 'arr': " << endl;
    cout << "----------------------------" << endl;
    for (int i = 0; i < SIZE; ++i) {
        cout << "element at index " << i << ": " << arr[i] << endl;
    }
}
