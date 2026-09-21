class Main {
    public static void main(String[] args) {

        int[] arr = {2, -1, 3, -5, 2};

        int minSum = arr[0];

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = i; j < arr.length; j++) {

                sum = sum + arr[j];

                if (sum < minSum) {
                    minSum = sum;
                }
            }
        }

        System.out.println("Minimum Subarray Sum = " + minSum);
    }
}