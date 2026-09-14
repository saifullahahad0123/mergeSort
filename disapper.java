import java.util.ArrayList;

public class disapper {

    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 3, 4, 3, 4};

        System.out.println(dis(arr));
    }

    public static ArrayList<Integer> dis(int[] arr) {

        int n = arr.length;
        int i = 0;

       
        while (i < n) {

            int correctIndex = arr[i] - 1;

            if (arr[i] != arr[correctIndex]) {

                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;

            } else {
                i++;
            }
        }

        
        ArrayList<Integer> ans = new ArrayList<>();

        for (i = 0; i < arr.length; i++) {

            if (arr[i] != i + 1) {
                ans.add(i + 1);
            }
        }

        return ans;
    }
}