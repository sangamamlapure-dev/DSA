String str = "Java is powerful";
String result = "";

for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) != ' ') {
        result += str.charAt(i);
    }
}

System.out.println(result);