public class InsertionSort{
    public static void main(String[] args) {
        int[] arr= { 9,10,5,3,77,45};
        System.out.println("before insertion sort");
       
        for(int i: arr){
            System.out.print(i + " ");
        }
         System.out.println(" ");

        insertionSort(arr);
        System.out.println("after insertion sort");
        for(int i: arr){
            System.out.print(i + " ");
        }
    

    }
    

    // i is variable which is tracks my current element 
    // j tracks element on the left side of i 
    static void insertionSort(int[] arr){
        int n= arr.length;
        for(int i=1; i<n; i++){
            int temp= arr[i]; //temp stores the value we will sort
            int j= i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp; // after j-- the j pointer is one position behind the one the we want to put our value
        }

    }
}