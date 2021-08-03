import java.util.Scanner;

public class Lab1Q2 {
    static int factorial(int n)
    {
        if (n == 0)
            return 1;
  
        return n * factorial(n - 1); // Return the factorial formula for recursion
    }
  
    // Printing the final value
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num
                           + " is " + factorial(num));
    }
}
