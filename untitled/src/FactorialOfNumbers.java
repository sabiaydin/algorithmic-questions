package untitled.src;

public class FactorialOfNumbers {
    public static int findFactorial(int number) {
        int fact = 1;
//        if (number == 0) {
//            return 1;
//        }it may not be written
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }
}
