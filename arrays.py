def rotateLeft(arr, n):
    # Reverse the first part of the array
    arr[0:n] = reversed(arr[0:n])
    # print(arr, arr[0:n])
    # Reverse the second part of the array
    arr[n:] = reversed(arr[n:])
    # print(arr)
    
    # Reverse the whole array
    arr[:] = reversed(arr)
    print(arr)

x = [1, 2, 3, 4, 5, 6]
n = 3
rotateLeft(x, n)  # Output: [4, 5, 6, 1, 2, 3]
