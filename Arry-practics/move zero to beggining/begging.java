class codex{
    public static void main(String[] args) {

        int[] a = {1, 0, 2, 0, 3};

        int index = a.length - 1;

        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] != 0) {
                a[index] = a[i];
                index--;
            }
        }

        while (index >= 0) {
            a[index] = 0;
            index--;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}