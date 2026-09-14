import java.util.*;

public class ArrayDuplicates {

    public static List<Integer> findDuplicates(int[] arr) {

        int i = 0;

        while (i < arr.length) {

            int correctIndex = arr[i] - 1;

            if (arr[i] != arr[correctIndex]) {

                // swap
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;

            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        // Find duplicates
        for (i = 0; i < arr.length; i++) {

            if (arr[i] != i + 1) {
                ans.add(arr[i]);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};

        System.out.println(findDuplicates(arr));
    }
}
