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
    s=nums[0]
    for i in range(1,len(nums)):
        s+=nums[i]
        maxSum=max(s,maxSum)
        if(s<=0):
            s=0
            # print(nums[i:j], sum(nums[i:j]))
            # if sum(nums[i:j])>ans:
            #     sub_array=nums[i:j]
            #     ans=sum(nums[i:j])

    print(maxSum)
findSubs([5,4,-1,7,8])
# findSubs([-2,1,-3,4,-1,2,1,-5,4])