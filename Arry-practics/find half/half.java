public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            left++;
            right--;
        }

        for (int i = 0; i < left; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}