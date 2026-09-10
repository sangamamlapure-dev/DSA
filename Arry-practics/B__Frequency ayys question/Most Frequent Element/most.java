class Codex{
    public static void main(String args[]) {

        int a[] = {1, 2, 2, 3, 2, 4, 1};
	int freq[] = new int[10];

        for (int i = 0; i < a.length; i++) {
            freq[a[i]]++;
        }

        int max = 0;
        int element = 0;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > max) {
                max = freq[i];
                element = i;
            }
        }

        System.out.println(element);
    }
}