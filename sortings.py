x=[4,3,2,6,7,1]
l=0
r=len(x)-1
def mergeSort(arr,l,r):
    if(l>=r):
        return 
    mid=(l+r)//2
    mergeSort(arr,l,mid)
    mergeSort(arr,mid+1,r)
    merge(arr,l,r,mid)



mergeSort(x,l,r)