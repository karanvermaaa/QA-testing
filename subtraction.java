import java.util.Scanner;

public class subtraction {

    public static void main(String[] args) {
        Scanner number1Scanner = new Scanner(System.in);
        Scanner number2Scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int nUMBER1 = number1Scanner.nextInt();

        System.out.println("Enter second number: ");
        int nUMBER2 = number2Scanner.nextInt();

        int z = Total(nUMBER1, nUMBER2);
        System.out.println("You got " + z);
    }

    static int Total(int a, int b) {
        int z = a - b;
        return z;

    }
}