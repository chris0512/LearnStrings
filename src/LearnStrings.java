public class LearnStrings {
    public static void main(String[] args) {
        String text1 = "this is my text1";
        String text2 = "this is my text2";
//        System.out.println(text1 + " " + text2 + " hello");

//        System.out.println("my string literal".concat("second string literal"));

        String finalString = new StringBuilder(text1.length() + text2.length() + 1)
                .append(text1)
                .append(" ")
                .append(text2)
                .toString();
        System.out.println(finalString);

        String otherFinalString = new StringBuffer()
                .append(text1)
                .append(" ")
                .append(text2)
                .toString();
        System.out.println(otherFinalString);

        System.out.format("%s %s\n", text1, text2);
        String oneMoreFinalString = String.format("%s %s", text1, text2);
        System.out.println(oneMoreFinalString);
    }

}
