public class S5 {
    //find minimum element index of an array
    public static void main(String[] args) {
      int[] arr = {10, 25, 83, 45, -6, 96, 56};  
      System.out.println(minimum(arr));
    }
    static int minimum(int[] arr){
        int min = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
          if(arr[i]< min){
            min = arr[i];
            index = i;
          }  
        }
        return index;
    }
} 
