package untitled.src;

public class ArmstrongNumber {
    public static boolean isArmstrongNumber(int number) {
        if (number < 0) {
            return false;
        }
        int originalNumber = number;
        int count = 0;
        int sum = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        number = originalNumber;
        while (number > 0) {
            int digit = number % 10;
            sum += (int) Math.pow(digit, count);
            number /= 10;
        }
        return originalNumber == sum;
    }
}
/*another version:
public static boolean isArmstrongNumber(int number) {
        if (number < 0) {
            return false;
        }
        int originalNumber = number;
        int digits = String.valueOf(number).length(); // Calculate the number of digits
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }
        return originalNumber == sum;
    }
*/