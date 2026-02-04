package practice;

public class LenearSearch {
    public static void main(String[] args) {
        int arr[] = {2,2,3,4,7,8,5,4,9,50,2};
        // lenearSearch(arr, 2, false);
        // lenearSearch(arr, 2, true);

        lenearSearchMultiple(arr, 2);

        
    }

    public static void lenearSearch(int arr[], int target, boolean findLast) {
        int ans =-1;
        for(int i =0; i<arr.length; i++){
            if(arr[i] ==  target){
                ans = i;
                if(findLast ==false)
                break;
            }
        }
        if(ans == -1){
            System.out.println("Elemnet is not present in array");
        } else{
            System.out.println("Found element at pos: " + ans);
        }
        
    }


    public static void lenearSearchMultiple(int arr[], int target) {
        
        int ans[] = new int[arr.length];
        int k = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i] ==  target){
              
                ans[k] = i;
                k++;
               
            }
        }
        if(k == 0){
            System.out.println("Elemnet is not present in array");
        } else{
            for(int i = 0; i < k; i++){
                System.out.println("Found element at pos: " + ans[i]);
            }
        }
        
    }
}
