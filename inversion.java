public class inversion {

    static int count = 0;

    public static void main(String[] args) {

        int[] arr = {5, 3, 2, 4, 1};

        mergeSort(arr);

        System.out.println("Number of inversions = " + count);
    }

    public static void mergeSort(int[] arr) {

        int n = arr.length;

        if (n <= 1) {
            return;
        }

       
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];

        int idx = 0;

      
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[idx++];
        }

       
        for (int i = 0; i < b.length; i++) {
            b[i] = arr[idx++];
        }

        
        mergeSort(a);
        mergeSort(b);

       
        mergeAll(a, b, arr);
    }

    public static void mergeAll(int[] a, int[] b, int[] c) {

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {

            if (a[i] <= b[j]) {

                c[k++] = a[i++];

            } else {

                // Inversion found
                count += a.length - i;

                c[k++] = b[j++];
            }
        }

        while (i < a.length) {
            c[k++] = a[i++];
        }

     
        while (j < b.length) {
            c[k++] = b[j++];
        }
    }
}
