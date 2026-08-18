public class S9 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int target = 36;

        System.out.println(binarySearch(arr, target));
    }

    static boolean binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return true;
            }

            if (isAsc) {
                // Ascending array
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                // Descending array
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return false;
    }
}