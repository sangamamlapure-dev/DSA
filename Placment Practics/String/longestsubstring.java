public class Main {
    public static void main(String[] args) {
        String s = "abcabcbb";
        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            String current = "";

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);

                if (current.indexOf(ch) != -1) {
                    break;
                }

                current = current + ch;
            }

            if (current.length() > longest.length()) {
                longest = current;
            }
        }

        System.out.println(longest);
        System.out.println("Length: " + longest.length());
    }
}