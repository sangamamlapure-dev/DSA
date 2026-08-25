public class Main {
    public static void main(String[] args) {
        int n = 58372938;
        int answer = -1;

        while (n > 0) {
            int digit = n % 10;
            int temp = n / 10;

            while (temp > 0) {
                if (digit == temp % 10) {
                    answer = digit;
                    break;
                }
                temp /= 10;
            }

            if (answer != -1)
                break;

            n /= 10;
        }

        System.out.println("Repeated digit: " + answer);
    }
}