class Codex{
    public static void main(String[] args) {

        int[] arr = {3, -4, 2, -1};

        int minSum = Integer.MAX_VALUE;

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