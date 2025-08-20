#include <iostream>
using namespace std;

int main() {
    /* docs */

    /* 
     * apart from using std::vector, dynamic arrays in C++ can also be implemented using pointers and manual memory management.
     * this approach allows for more control over memory allocation and deallocation, but it requires careful
     * management to avoid memory leaks and undefined behavior.
     * the `new` operator is used to allocate memory for the array, and the `delete` operator is used to free that memory when it is no longer needed.
     * this method is less common in modern C++ due to the availability of safer alternatives like `std::vector`,
     * but it is still a valid way to create dynamic arrays.
    */

    /* code */

    // get the size of the dynamic array from user input
    int size;
    cout << "Enter the size of the dynamic array: ";
    cin >> size;

    int* arr = new int[size];
    cout << "created dynamic array of size " << size << endl;

    // fill the dynamic array with values
    cout << "dynamic array 'arr' elements: " << endl;
    cout << "----------------------------" << endl;
    for (int i = 0; i < size; ++i) {
        arr[i] = i + 1; // Assigning values to the dynamic array
        cout << "element " << i + 1 <<  ": \t" << arr[i] << endl;
    }

    // deallocate the memory used by the dynamic array
    cout << "----------------------------" << endl;
    delete[] arr;
    cout << "memory deallocated for dynamic array 'arr'" << endl;
}