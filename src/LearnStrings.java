public class LearnStrings {
    public static void main(String[] args) {
       String myText = "apple";
        String firstPart = myText.substring(0, 1);
        String secondPart = myText.substring(1);
        String capitalFirstLetter = firstPart.toUpperCase();
        int capacity = capitalFirstLetter.length() + secondPart.length();
        String myNewText = new StringBuilder(capacity)
                .append(capitalFirstLetter)
                .append(secondPart)
                .toString();

       System.out.println(myNewText);

    }

}
