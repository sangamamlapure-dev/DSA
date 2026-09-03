public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        int search = 20;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            if (arr[left] == search) {
                System.out.println(left);
                break;
            }

            left++;
        }
    }
}