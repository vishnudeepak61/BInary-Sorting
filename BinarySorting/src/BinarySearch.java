
public class BinarySearch {
    public static void main(String[] args) throws Exception {
        int arr[] = {-18,-12,-4,2,23,43,65,67,89};
        int target = 100;
        System.out.println(binarySearch(arr, target));
    }

    //return the index
    //return -1 if it doesnt exist
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;        

        while(start<=end){

            int mid = (start+end)/2;

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }        
        }
    return -1;    

    }
}
