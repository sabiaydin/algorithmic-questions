package algporithmicQuestions.src;

public class PrintPattern {
    public static void rightTriangle() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void leftTriangle() {
        for (int i = 0; i <= 5; i++) {
            for (int j = (5 - i) * 2; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void pyramidStar() {
        for (int i = 0; i <= 5; i++) {
            for (int j = (5 - i) * 2; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void diamondShape() {
        for (int i = 0; i <= 5; i++) {
            for (int j = (5 - i) * 2; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 0; i <= 5; i++) {
            for (int k = 0; k <= i * 2 + 1; k++) {
                System.out.print(" ");
            }
            for (int j = (5 - i - 1) * 2 + 1; j > 0; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void downwardTriangle(){
        for (int i=5;i>=0;i--){
            for (int j=i;j>0;j--){
                System.out.print(" *");
            }
            System.out.println();        }
    }
}
