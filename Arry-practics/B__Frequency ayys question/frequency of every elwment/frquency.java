class Frequency {
    public static void main(String args[]) {

        int a[] = {1, 2, 2, 3, 1, 1, 4};

        int freq[] = new int[10];

        for (int i = 0; i < a.length; i++) {
            freq[a[i]]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " -> " + freq[i]);
            }
        }
    }
}