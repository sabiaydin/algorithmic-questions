package algporithmicQuestions.src;

public class PetersonNumbers {
    public static boolean isPeterson(int number){
        int originalNumber=number;
        int sum = 0;
        while (number>0){
            int digit = number%10;
           sum+= findFactorial(digit);
            number/=10;
        }
        return originalNumber==sum;
    }
    private static int findFactorial(int number2){
        int fact=1;
        for (int i=1;i<=number2;i++){
            fact*=i;
        }
        return fact;
    }
}
