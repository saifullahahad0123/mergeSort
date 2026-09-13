public class merge {

    public static void main(String[] args) {

        int[] arr = {1, 3, 6, 4, 2, 0, -2};

        mergeSort(arr);

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
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
            } 
            else {
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