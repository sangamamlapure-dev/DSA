class Codex{
    public static void main(String args[]) {

        int a[] = {1, 2, 2, 3, 3, 3, 4};
	int freq[] = new int[10];

        for (int i = 0; i < a.length; i++) {
            freq[a[i]]++;
        }

        int count = 0;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}