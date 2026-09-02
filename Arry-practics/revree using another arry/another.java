class Codex {
    public static void main(String args[]) {

        int arr[] = {10, 20, 30, 40};
        int arr1[] = new int[arr.length];
	int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            arr1[j] = arr[i];
            j++;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}