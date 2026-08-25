public class Main {
    public static void main(String[] args) {
        int n = 583729;
        int largest = 0;
        int smallest = 9;

        while (n > 0) {
            int digit = n % 10;

            if (digit > largest)
                largest = digit;

            if (digit < smallest)
                smallest = digit;

            n /= 10;
        }

        System.out.println("Sum: " + (largest + smallest));
    }
}