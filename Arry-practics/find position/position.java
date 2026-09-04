public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 3, 1};
        int search = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.print(i + " ");
            }
        }
    }
}