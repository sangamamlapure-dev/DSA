class Main {
    public static void main(String[] args) {
        String s = "madam";
        boolean flag = true;

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                flag = false;
                break;
            }
        }

        System.out.println(flag ? "Palindrome" : "Not Palindrome");
    }
}