import java.util.InputMismatchException;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try
        {
            System.out.print("Enter a number: ");
            int a = scan.nextInt();
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        catch (NumberFormatException e)
        {
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch (NullPointerException e)
        {
            System.out.println();
        }
        catch (InputMismatchException e)
        {
            System.out.println(e);
        }


    }
}
