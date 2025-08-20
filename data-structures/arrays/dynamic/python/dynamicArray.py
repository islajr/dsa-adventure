import random

""" 
DYNAMIC ARRAYS
---------------

this is an example of a dynamic array in python using lists.
"""

arr = []    # creating an empty dynamic array

for i in range(10):
    arr.append(random.randint(1, 10))  # appending elements to the dynamic array


# outputing elements to the standard output
print("dynamic array 'arr' elements:\n------------------------------------")
for i in range(len(arr)):
    print("element", (i + 1), "\t", arr[i])  # printing the elements of the dynamic array
