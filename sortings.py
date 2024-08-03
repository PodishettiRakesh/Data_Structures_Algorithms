x=[4,3,2,6,7,1]
l=0
r=len(x)-1
def mergeSort(arr,l,r):
    if(l>=r):
        return 
    mid=(l+r)//2
    mergeSort(arr,l,mid)
    mergeSort(arr,mid+1,r)
    merge(arr,l,mid,r)
    return arr

def merge(array,l,mid,r):
    leftArray=array[l:mid+1]
    rightArray=array[mid+1:r+1]
    print(f"left array {leftArray}  right array  {rightArray}")
    i=0
    j=0
    r=l
    ans=array

    while i<len(leftArray) and j<len(rightArray):
        if leftArray[i]<= rightArray[j]:
            ans[r]=leftArray[i]
            i+=1
        else:
            ans[r]=rightArray[j]
            j+=1
        r+=1

    while i<len(leftArray):
        ans[r]=leftArray[i]
        i+=1
        r+=1
    
    while j<len(rightArray):
        ans[r]=rightArray[j]
        j+=1
        r+=1
print(mergeSort(x,l,r))