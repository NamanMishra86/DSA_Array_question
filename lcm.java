import java.util.Scanner;

public class lcm {

    // Correct GCD function using Euclid's Algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // LCM function
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        int lcm12 = lcm(num1, num2);       // LCM of first 2
        int finalLCM = lcm(lcm12, num3);   // LCM with 3rd

        System.out.println("LCM of " + num1 + ", " + num2 + ", " + num3 + " = " + finalLCM);
    }
}
