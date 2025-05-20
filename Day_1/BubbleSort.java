package Day_1;
public class BubbleSort {
    public static void main(String[] args) {

        int arr[] = {200, 22, 18, 35, 48, 26, 87, 70};
        int n= arr.length;

        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n-i-1; j++) {

                if (arr[j]> arr[j+1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                }
            }
            
        }
        System.out.println();

        // short hand
        // for (int num : arr) {
        //     System.out.print(num + " ");
        // }


        System.out.println("bubble_sorted:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
          }
    }
}
