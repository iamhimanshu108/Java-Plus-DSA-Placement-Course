public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 11, 45, 87, 90};
        binarySearch(arr, 87);
    }

    static void binarySearch(int[] arr, int target){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2; // safe mid

            if (arr[mid] == target){
                ans = mid;
                break;
            } else if (arr[mid] < target){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (ans == -1){
            System.out.println("Element Not Found");
        } else {
            System.out.println("Found element " + target + " at index " + ans);
        }
    }
}
