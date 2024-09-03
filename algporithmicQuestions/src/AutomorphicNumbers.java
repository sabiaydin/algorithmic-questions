package algporithmicQuestions.src;

public class AutomorphicNumbers {
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        while (number > 0) {
            if (number % 10 != square % 10) {
                return false;
            }
            number /= 10;
            square /=   10;
        }
        return true;
    }
}
