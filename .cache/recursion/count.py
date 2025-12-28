# count: recursively counts and returns the number of items in a list
def count (list):
    if list == []:
        return 0
    return 1 + count(list[1:])

# test case 1:
print(f"expected: 5\nactual: {count([1, 2, 3, 4, 5])}")

# test case 2:
print(f"expected: 0\nactual: {count([])}")
