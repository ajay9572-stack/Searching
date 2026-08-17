public class S6 {
    // search of 2D array
    public static void main(String[] args) {
         int[][] arr = {{10, 25, -6, 96, 56}, {12, 9, 14, 77}};  
         int target = 96;
      System.out.println(searchTwoDArray(arr, target));
    }
    static int searchTwoDArray(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target){
                    return arr[i][j];
                }
                
            }
            
        }
        return -1;
    }
}
