public class ReversePairs {

    static int count = 0;

    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 3, 1};

        mergeSort(arr);

        System.out.println("Number of reverse pairs = " + count);
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

    
        countPairs(a, b);

    
        mergeAll(a, b, arr);
    }

    public static void countPairs(int[] a, int[] b) {

        int j = 0;

        for (int i = 0; i < a.length; i++) {

            while (j < b.length &&
                   (long) a[i] > 2L * b[j]) {

                j++;
            }

            count += j;
        }
    }

    public static void mergeAll(int[] a, int[] b, int[] c) {

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {

            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
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
