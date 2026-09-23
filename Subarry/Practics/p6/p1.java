class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        int n = arr.length;

        int count = n * (n + 1) / 2;

        System.out.println("Total subarrays = " + count);
    }
}