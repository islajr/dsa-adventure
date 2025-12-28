# qsort: returns a sorted array using the quicksort algorithm
def qsort(arr):
    if len(arr) < 2:
        return arr
    else:
        pivot = arr[0]
        lesser = [i for i in arr[1:] if i <= pivot]
        greater = [i for i in arr[1:] if i > pivot]

        return qsort(lesser) + [pivot] + qsort(greater)


# test case 1:
arr_1 = [2, 5, 3, 7, 8, 9, 4]
arr_1_sorted = qsort(arr_1)
print(f"test 1:\nunsorted: {arr_1}\nsorted: {arr_1_sorted}\n")

# test case 2:
arr_2 = []
arr_2_sorted = qsort(arr_2)

print(f"test 2:\nunsorted: {arr_2}\nsorted: {arr_2_sorted}\n")


# test case 3:
