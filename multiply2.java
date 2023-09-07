import java.util.Scanner;

public class multiply2
{
    public static void main(String[] args) {
        Scanner number1Scanner = new Scanner(System.in);
        Scanner number2Scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int nUMBER1 = number1Scanner.nextInt();

        System.out.println("Enter second number: ");
        int nUMBER2 = number1Scanner.nextInt();

        int z = Multiply(nUMBER1,nUMBER2);
        System.out.println("You got " + z);
    }

   static int Multiply(int a, int b) {
        int z = a * b;
        return z;

    }
}
