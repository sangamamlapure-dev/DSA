class Codex {
    public static void main(String[] args) {

        int[] arr = {1, -2, 5, -1, 2};

        int maxSum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];

                if (sum > maxSum) {
                    maxSum = sum;
                    start = i;
                    end = j;
                }
            }
        }

        System.out.println("Start = " + start);
        System.out.println("End = " + end);
    }
}