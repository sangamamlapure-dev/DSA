class Subarray3 {
    public static void main(String[] args) {

        int arr[] = {2, -1, 3, -4, 5};

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];

                if (sum > max) {
                    max = sum;
                }
            }
        }

        System.out.println("Maximum Sum = " + max);
    }
}