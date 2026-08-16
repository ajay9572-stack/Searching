
public class S2{
    public static void main(String[] args){
     int[] arr = {18, 12, 9, 14, 77, 50};
     int target= 14;
     System.out.println(linearSerach(arr, target));
    }
    static int linearSerach(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int i =0; i<arr.length ;i++){
            if (target == arr[i]){
                return i;
            }
        }
        return target;
    }
}