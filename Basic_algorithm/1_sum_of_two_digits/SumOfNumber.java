import java.util.Scanner;

class SumOfNumber {

    private static final int NEXT_INT = new Scanner(System.in).nextInt();

    static int sum_Number(int first, int second) {
        return first + second;
    }

    public static void main(String[] args) {
        var nextInt = NEXT_INT;
        int a = nextInt;
        int b = nextInt;
        System.out.println("Total : " + sum_Number(a, b));
    }

}