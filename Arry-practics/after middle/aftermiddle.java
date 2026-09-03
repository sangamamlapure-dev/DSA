public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            left++;
            right--;
        }

        for (int i = left + 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}