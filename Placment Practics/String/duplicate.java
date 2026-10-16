public class Main {
    public static void main(String[] args) {
        int[] a = {2, 4, 2, 5, 4, 7};

        for (int i = 0; i < a.length; i++) {
            boolean duplicate = false;

            for (int k = 0; k < i; k++) {
                if (a[i] == a[k]) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate) {
                continue;
            }

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
    }
}