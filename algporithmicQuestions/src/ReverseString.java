package algporithmicQuestions.src;

public class ReverseString {
    public static String reverseOfText(String text){
        String reversedText = "";
        for (int i=0;i<text.length();i++){
            reversedText = text.charAt(i) + reversedText;
        }
        return reversedText;
    }
    public static boolean isPalindromeString(String text){
        StringBuilder reversedText= new StringBuilder();
        for (int i=0;i<text.length();i++){
            reversedText.insert(0, text.charAt(i));
        }
        return text.equalsIgnoreCase(reversedText.toString());
    }
  /*  public static String reverseOfText(String text){
        StringBuilder stringBuilder = new StringBuilder(text);
        return stringBuilder.reverse().toString();
    }*/
}
