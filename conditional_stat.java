import java.util.Scanner;
public class conditional_stat {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // int a=18;
        int i;
        System.out.println("i :");
        i= sc.nextInt();
        if(i%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}