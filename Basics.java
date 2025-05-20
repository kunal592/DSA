public class Basics {



    public static void main(String[] args) {
        System.out.println("i'm back babe");

        int arr[] = {20, 22, 18, 35, 48, 26, 87, 70};
        int n= arr.length;

        for (int i = 0; i < n-1; i++) {
            int sml = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j]< arr[sml]) {
                    sml=j;
                    System.out.print(" "+ sml);
                }
            }
            int temp =arr[sml];
            arr[sml]=arr[i];
            arr[i]=temp;
            

        }
        System.out.println();
        System.out.println("sorted:");
        for (int i = 0; i < n; i++) {

            System.out.print(arr[i] + " ");
            
          }
        
    }
}
