public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int search = 2;
        boolean exists = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                exists = true;
                break;
            }
        }

        if (exists) {
            System.out.println("Exists");
        } else {
            System.out.println("Not Exists");
        }
    }
}