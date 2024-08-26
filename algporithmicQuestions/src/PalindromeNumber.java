package algporithmicQuestions.src;

public class PalindromeNumber {
    public static boolean isPalindrome(int number){
        if(number<0){
            return false;
        }
        int originalNumber=number;
        int reversedNumber =0;
        while (number!=0){
          reversedNumber = reversedNumber *10+number%10;
          number/=10;
        }
       return originalNumber==reversedNumber;
    }
}

