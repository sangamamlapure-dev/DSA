public class Main {
    public static void main(String[] args) {
        String s = "Java programming is interesting";
        String[] words = s.split(" ");

        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println(longest);
    }
}