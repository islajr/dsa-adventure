#include <iostream>

int main() {
    // program to find the length of an array
    int myArray[5] = {1, 2, 3, 4, 5};
    int length = 0;

    for (int i = 0; myArray[i] != '\0'; ++i) {
        length++;
    }

    std::cout << "The length of this array is " << length << std::endl;
}


