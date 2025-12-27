# find_smallest: returns the index of the smallest element of an array
def find_smallest(arr):
    smallest = arr[0]
    smallest_index = 0;

    for i in range (1, len(arr)):
        if arr[i] < smallest:
            smallest = arr[i]
            smallest_index = i
    
    return smallest_index

# selection_sort: returns an ordered array using an implementation of the selection sort algorithm
def selection_sort(arr):
    new_arr = []

    for i in range(0, len(arr)):
        smallest = find_smallest(arr)
        new_arr.append(arr.pop(smallest))
    return new_arr

# test case:
sorted_array = selection_sort([2, 5, 1, 8, 4, 7])

for i in range(0, len(sorted_array)):
    print(sorted_array[i], end=" ")
