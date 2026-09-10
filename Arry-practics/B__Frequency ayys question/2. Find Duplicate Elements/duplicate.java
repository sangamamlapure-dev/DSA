class Duplicate {
    public static void main(String args[]) {

        int a[] = {1, 2, 3, 2, 4, 1, 5};

        int freq[] = new int[10];

        for (int i = 0; i < a.length; i++) {
            freq[a[i]]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 1) {
                System.out.print(i + " ");
            }
        }
    }
}