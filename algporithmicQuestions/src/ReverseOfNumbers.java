package algporithmicQuestions.src;

public class ReverseOfNumbers {
    public static void reverseNumber(int number) {
        int originalNumber=number;
        int reverseNumber = 0;
        while (number > 0) {
            reverseNumber = reverseNumber * 10 + number % 10;
            number /= 10;
        }
        System.out.println("Reverse of this number : " + originalNumber + " is " + reverseNumber);
    }
}
