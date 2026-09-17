class Codex{
    public static void main(String[] args) {

        String s = "java programming language";

        String words[] = s.split(" ");

        String largest = "";

        for(int i = 0; i < words.length; i++) {

            if(words[i].length() > largest.length()) {
                largest = words[i];
            }
        }

        System.out.println("Largest word = " + largest);
        System.out.println("Length = " + largest.length());
    }
}