public class S8 {
    // bineary search 
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11,  12, 14, 20, 36, 48};
        int target = 36;
        System.out.println(binerySearch(arr, target));    
    }
    static int binerySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        
        while(start<= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid -1;
            }else if( target> arr[mid]){
                start = mid +1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
