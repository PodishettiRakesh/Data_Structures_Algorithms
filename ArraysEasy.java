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
    public static void main(String[] args) {
        int[] arr={11,12,23,2,14,45,34};
        ArraysEasy obj= new ArraysEasy();
        System.out.println(obj.findSecondLargest(arr));

    }
}
