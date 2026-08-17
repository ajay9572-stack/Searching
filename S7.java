import java.util.Arrays;
// search for 2D array and print index value

public class S7 {
    public static void main(String[] args) {

        int[][] arr = {{10, 25, -6, 96, 56},{12, 9, 14, 77}};
        int target = 56;
        int[] ans = searchTwoDArray(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchTwoDArray(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}