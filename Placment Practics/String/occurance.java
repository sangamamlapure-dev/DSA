class Main {
    public static void main(String[] args) {
        String s = "programming";
        char target = 'm';
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("Count: " + count);
    }
}