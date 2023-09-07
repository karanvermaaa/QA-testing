import java.util.Scanner;

public class double2 {
    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int nUMBER = numberScanner.nextInt();

        int z = Double(nUMBER);
        System.out.println("Your return is " + z);
    }

    static int Double(int x)
    {
        int z = x + x;
        return z;
    }
}
