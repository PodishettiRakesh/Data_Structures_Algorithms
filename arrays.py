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
    # temp=[]
    # for i in range(len(arr)):
    #     if arr[i]!=0:
    #         temp.append(arr[i])
    # for i in range(len(temp)):
    #     arr[i]=temp[i]
    # for i in range(len(temp), len(arr)):
    #     arr[i]=0
    j=-1
    for i in range(len(arr)):
        if arr[i]==0:
            j=i
            break
    if j== -1:
        return 
    
    for i in range(j+1,len(arr)):
        if arr[i]!=0:
            arr[i],arr[j]=arr[j],arr[i]
            j+=1
    
# x=[1,0,2,0,3,4,0]
# moveZerosToEnd(x)
# print(x)



def find_union(arr1, arr2):
    freq = {}
    union = []
    
    for num in arr1:
        freq[num] = freq.get(num, 0) + 1
        print(freq)
    
    for num in arr2:
        freq[num] = freq.get(num, 0) + 1
        print("arr2", freq)
    
    for num in freq:
        union.append(num)
    
    return union

arr1 = [1, 2, 3, 4, 5, 6,6,6, 7, 8, 9, 10]
arr2 = [2, 3, 4, 4, 5, 11, 12]

# union = find_union(arr1, arr2)

# print("Union of arr1 and arr2 is:")
# for num in union:
#     print(num, end=" ")


def findSubs(nums):
    maxSum=nums[0]
    s=0
    start=0
    end=0
    temp_s=0
    for i in range(0,len(nums)):
        s+=nums[i]
        if s>maxSum:
            maxSum=max(s,maxSum)
            start=temp_s
            end=i

        if(s<=0):
            s=0
            temp_s+1
    

    print(maxSum, nums[start:end+1])


findSubs([5,9,4,-1,-7,-8])
findSubs([-2,-9,1,-3,4,-1,2,1,-5,4])

def mergeSortedArrays(a,b):
    i=0
    j=0
    m=len(a)
    n=len(b)
    res=[]
    while i<m and j<n:
        if a[i]<= b[j]:
            res.append(a[i])
            i+=1
        else:
            res.append(b[j])
            j+=1

    while i<m:
        res.append(a[i])
        i+=1
    
    while j<n:
        res.append(b[j])
        j+=1

    return res

# print(mergeSortedArrays([1,2,33,88],[1,3,4,6,10,19])) Inplace
#find duplicate using  


# def mergeSortedInplace(a,b):

def findDuplicate(nums):
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):

                if nums[i]==nums[j]:
                    print(i,j,nums[i], nums[j])
                    return nums[i]
# print(findDuplicate([1,3,4,2,2]))

