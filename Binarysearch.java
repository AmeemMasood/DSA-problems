public class Binarysearch {
    public static void main(String[] args) {
        int[] arr= {5};//array should be ascendingly ordered 
        System.out.println(binarysearch(arr, 5));

        
    }



    static boolean binarysearch(int[] arr, int target){
            int end=arr.length;
            int start=0;
            
            while(end>start){
                //int mid=(end + start)/2; it may exceed the integer value if start and end are verylarge value
                //better way to do the same thing
                int mid=start + (end-start)/2; //this will never exceed the int value
                if (target==arr[mid]){
                    return true;
                }
               //slicing the array to mini array
                else if (target >mid){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
                
                mid=(end+start)/2; // gives you new mid value
            }

             return false;
           
        }

}
