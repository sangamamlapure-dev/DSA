public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            left++;
            right--;
        }

        System.out.println(arr[left]);
    }
}