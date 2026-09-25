class MaximumSumIndex {

    public static void main(String[] args) {

        int[] arr = {1, -2, 5, -1, 2};

        int maxSum = arr[0];
        int currentSum = arr[0];

        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 1; i < arr.length; i++) {

            if (currentSum + arr[i] < arr[i]) {
                currentSum = arr[i];
                tempStart = i;
            } else {
                currentSum = currentSum + arr[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        System.out.println("Start = " + start);
        System.out.println("End = " + end);
    }
}