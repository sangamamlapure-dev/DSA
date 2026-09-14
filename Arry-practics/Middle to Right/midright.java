class Main {
    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 50};

        int left = a.length / 2;
        int right = a.length - 1;

        while (left <= right) {
            System.out.print(a[left] + " ");
            left++;
        }
    }
}