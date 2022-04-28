public class LearnStrings {
    public static void main(String[] args) {
        String myText = "for";
        String secondText = "score";
        StringBuilder builder = new StringBuilder(myText.length() + secondText.length())
                .append(myText)
                .append(secondText);

        System.out.println(builder.toString());

    }

}
