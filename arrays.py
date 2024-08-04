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

# x = [1, 2, 3, 4, 5, 6]
# n = 3
# rotateLeft(x, n)  # Output: [4, 5, 6, 1, 2, 3]


def rotate_Left(arr,n):
    size=len(arr)
    if n==0:
        return
    n=n%size

    def reverse(arr,left, right):
        print("array",arr[left:right])
        while left<=right:
            arr[left],arr[right]=arr[right],arr[left]
            left+=1
            right-=1

    reverse(arr,0,n-1)
    # print(arr)
    reverse(arr,n,size-1)
    reverse(arr,0,size-1)

# x=[1,2,3,4,5,6,7]
# print(x)
# n=4
# rotate_Left(x,n)
# print(x)


def moveZerosToEnd(arr):
    temp=[]
    for i in range(len(arr)):
        if arr[i]!=0:
            temp.append(arr[i])
    for i in range(len(temp)):
        arr[i]=temp[i]
    for i in range(len(temp), len(arr)):
        arr[i]=0
x=[1,0,2,0,3,4,0]
moveZerosToEnd(x)
print(x)

