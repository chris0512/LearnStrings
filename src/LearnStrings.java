public class LearnStrings {
    public static void main(String[] args) {
        String myText = "for";
        System.out.println(myText.length());
        char[] chars = myText.toCharArray();
        int index = 2;
        if(index < myText.length()){
            System.out.println(chars[index]);
        }

    }

}
