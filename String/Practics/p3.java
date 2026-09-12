class ReverseWords {
    public static void main(String[] args) {
        String s = "Java is easy";
        String single = "";

        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) != ' ') {
                word = single + s.charAt(i);
            }
            else {
                for(int j = word.length() - 1; j >= 0; j--) {
                    System.out.print(single.charAt(j));
                }

                System.out.print(" ");
                word = "";
            }
        }

        for(int j = single.length() - 1; j >= 0; j--) {
            System.out.print(single.charAt(j));
        }
    }
}