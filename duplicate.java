public class duplicate {

    public static int findDuplicate(int[] arr) {

        int i = 0;

        while (i < arr.length) {

            if (arr[i] == i + 1) {
                i++;
            }
            else {
                int idx = arr[i] - 1;

                if (arr[i] == arr[idx]) {
                    return arr[i];
                }

                // swap
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 2, 2};

        System.out.println(findDuplicate(arr));
    }
}