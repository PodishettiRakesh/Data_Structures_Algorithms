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
        // for(int i=1; i<arr.length; i++){
        //     if(arr[i]<arr[i-1]){
        //         return false;
        //     }
        // }
        // return true;

        int breakPoint=0;
        for(int i =0; i<arr.length-1; i++){
            if(arr[i+1]<arr[i]){
                breakPoint=i+1;
            }
        }

        for(int i=1; i<breakPoint;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        for(int i=breakPoint+1; i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;

    }

    
    public static void main(String[] args) {
        int[] arr={23,45,11,12,15,9};
        ArraysEasy obj= new ArraysEasy();
        // System.out.println(obj.findSecondLargest(arr));
        // System.out.println(obj.findSecondSmallest(arr));
        System.out.println(obj.isSorted(arr));
    }
}
