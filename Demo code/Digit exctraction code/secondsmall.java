public class Main {
    public static void main(String[] args) {
        int n = 583729;
        int largest = -1;
        int second = -1;

        while (n > 0) {
            int digit = n % 10;

            if (digit > largest) {
                second = largest;
                largest = digit;
            } else if (digit > second && digit != largest) {
                second = digit;
            }

            n = n / 10;
        }

        System.out.println("Second largest: " + second);
    }
}