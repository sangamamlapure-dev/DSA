class Codex{
    public static void main(String[] args) {

        int arr[] = {4, -2, 3, -5, 6};

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = i; j < arr.length; j++) {

                sum = sum + arr[j];

                if (sum < min) {
                    min = sum;
                }
            }
        }

        System.out.println("Minimum Sum = " + min);
    }
}