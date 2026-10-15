
public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++)
                System.out.print(" ");

            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == n) {
                    System.out.print(j);
                } else if (j == 1) {
                    System.out.print(1);
                } else if (j == 2 * i - 1) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
