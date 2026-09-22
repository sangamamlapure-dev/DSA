class Codex{
    public static void main(String[] args) {

        int arr[] = {-2, 3, -1, 5, -6, 4};

        int max = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = i; j < arr.length; j++) {

                sum = sum + arr[j];

                if (sum > max) {
                    max = sum;
                    start = i;
                    end = j;
                }
            }
        }

        System.out.println("Maximum Sum = " + max);

        System.out.print("Subarray = ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}