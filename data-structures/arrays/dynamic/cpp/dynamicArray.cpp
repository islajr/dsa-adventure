#include <iostream>
#include <vector>
using namespace std;

int main() {
    /* docs */

    /* *
    * dynamic arrays in C++ can be implemented using the `std::vector` class, which allows for dynamic resizing and provides various utility functions.
    * unlike static arrays, which have a fixed size determined at compile time, dynamic arrays can grow or shrink as needed during runtime.
    * this flexibility is particularly useful when the size of the array cannot be predetermined.
    * the `std::vector` class manages memory automatically, so you don't have to worry about manual memory management like you would with raw pointers.
    */

    /* code */
    
    vector<int> arr;
    const int SIZE = 10;
    cout << "Dynamic array 'arr' elements: " << endl;
    cout << "----------------------------" << endl;

    for (int i = 0; i < SIZE; ++i) {
        arr.push_back(i + 1); // Adding elements to the dynamic array
    }

    for (int i = 0; i < arr.size(); ++i) {
        cout << "element " << i + 1 << ": \t" << arr[i] << endl;
    }
}
