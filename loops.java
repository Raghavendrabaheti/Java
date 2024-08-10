import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a, i;
        // i = 1;
        // System.out.println("a :");
        // a= sc.nextInt();
        // System.out.println("i :");
        // i= sc.nextInt();

        // while loop

        // while(i <=5 ){
        // System.out.println("You are great!!");
        // i++;
        // }

        // for loop

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}