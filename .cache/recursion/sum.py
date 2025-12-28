# sum: recursively computes and returns the sum of all elements in the list
def sum(list):
    if list == []:
        return 0
    return list[0] + sum(list[1:])

# test case 1:
print(f"expected: 6\nactual: {sum([1, 2, 3])}\n")

# test case 2:
print(f"expected: 0\nactual: {sum([])}")
