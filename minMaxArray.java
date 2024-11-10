public class minMaxArray {
    public static void main(String[] args) {
        int arr[]={5,6,7,1};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]) {
                min = arr[i];
            }
        }
         System.out.println ("minimum value=");

        System.out.println(min);

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println ("maximum value=");
        System.out.println(max);
    }
}