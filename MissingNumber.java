public class MissingNumber {

    public static int missingNumber(int[] arr) {

        int n = arr.length;
        int i = 0;

   
        while (i < n) {

          
            if (arr[i] == i || arr[i] == n) {
                i++;
            } 
            else {
                int idx = arr[i];

                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }

        for (i = 0; i < n; i++) {

            if (arr[i] != i) {
                return i;
            }
        }

        return n;
    }

    public static void main(String[] args) {

        int[] arr = {3, 0, 1};

        System.out.println(missingNumber(arr));
    }
}