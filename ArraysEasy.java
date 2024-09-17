import java.util.Arrays;

public class ArraysEasy {

    public int findSecondLargest(int[] arr){
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int num: arr){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            }else if(num>secondLargest && num< largest){
                secondLargest=num;
            }
        }
        if(secondLargest==Integer.MIN_VALUE){
            return -1;
        }else{
            return secondLargest;
        }
    }

    public int findSecondSmallest(int[] arr){
        int small=Integer.MAX_VALUE;
        int secondSmall=Integer.MAX_VALUE;
        for(int num: arr){
            if(num<small){
                secondSmall=small;
                small=num;
            }else if (num<secondSmall && num!=small){
                secondSmall=num;
            }
        }
        if(secondSmall==Integer.MAX_VALUE){
            return -1;
        }else{
            return secondSmall;
        } 
    }

    public boolean isSorted(int arr[]){
        for(int i=1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public boolean isSortedAndRotated(int arr[]){
        int breakPoint=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>arr[(i+1)%arr.length]){
                breakPoint+=1;
            }
        }

        return breakPoint<=1;
    }

    public int removeDuplicatesInSorted(int arr[]){
        int i=0;
        for(int j=1; j<arr.length; j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
            
        }
        return i+1;
    }

    public int[] rotateRight(int arr[], int k){
        int[] newArray= new int[arr.length];
        int j=0;
        for(int i=arr.length-k; i<arr.length; i++){
            newArray[j]=arr[i];
            j++;
        }
        for(int i=0; i<arr.length-k; i++){
            newArray[j]=arr[i];
            j++;
        }
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    public void reverseArray(int[] array, int start, int end){
        while(start<=end){
            int temp = array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }

    }

    public void rotateRightInPlace(int arr[], int k){
        reverseArray(arr, 0, arr.length-k-1);
        reverseArray(arr,arr.length-k,arr.length-1);
        reverseArray(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


    public void rotateLeft(int arr[], int k){
        reverseArray(arr, k, arr.length-1);
        reverseArray(arr, 0, k-1);
        reverseArray(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,4,7,7};
        ArraysEasy obj= new ArraysEasy();
        obj.rotateRightInPlace(arr, 4);
        obj.rotateLeft(arr, 4);

    }
}
