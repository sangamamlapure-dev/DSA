class CodeGurucool{
    public static void main(String[] args) {

        int[] a = {1, 2, 1, 3};

        int[] freq = new int[10];

        for (int i = 0; i < a.length; i++) {
            freq[a[i]]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println(i + "-" + freq[i]);
            }
        }
    }
}