public class LargestSmallest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 0; i<arr.length; i++){
            if (arr[i]>largest){
                largest = arr[i];
            }
            else if (arr[i]<smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Largest number is : "+largest);
        System.out.println("Smallest number is : "+smallest);
    }
}
