import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mult);
        System.out.println("Division: " + div);
    }
}
