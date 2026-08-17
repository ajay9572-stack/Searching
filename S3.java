public class S3{
    // search of an elemnet between a specific rage(index value)
    public static void main(String[] args) {
        int[] arr = {10, 25, 83, 45, -6, 96, 56};
        int target = -6;
        System.out.println(searchOfRange(arr, target, 1, 4));
        
    }
    static int searchOfRange(int[] arr, int target, int start, int end){
        if(arr.length ==0){
            return -1;
        }
        for(int i = start; i<= end; i++){
            if(target== arr[i]){
                return i;
            }
        }
        return -1;
    }
}