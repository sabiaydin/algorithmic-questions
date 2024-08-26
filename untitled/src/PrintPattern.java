package untitled.src;

public class PrintPattern {
    public static void rightTriangle(){
        for (int i=0;i<6;i++){
            for (int j=0;j<=i;j++){
            System.out.print("* ");
        }
            System.out.println();}
    }
    public static void leftTriangle(){
        for(int i=0;i<=5;i++){
            for(int j=(5-i);j>0;j--){
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
