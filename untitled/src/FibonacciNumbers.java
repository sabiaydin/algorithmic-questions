package untitled.src;

public  class FibonacciNumbers {
    public static int FibonacciSeries(int count) {
        if (count == 0) {
            return 0;
        } else if ((count == 1) || (count == 2)) {
            return 1;
        } else
            return FibonacciSeries(count - 1)+FibonacciSeries(count -2);
    }}
