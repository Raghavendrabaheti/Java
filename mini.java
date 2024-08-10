import java.util.Scanner;
public class mini {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=(int)(Math.random()*10);
        int usernum=0;

        do{
            System.out.println("Guess my number (0-10)");
            usernum= sc.nextInt();
            if(usernum == num){
                System.out.println("WOOHOO .. CORRECT NUMBER");
                break ;
            }
            else if(usernum > num){
                System.out.println("Your Number is Large");
            }
            else{
                System.out.println("Your number is Small");
            }
        }
            while (usernum >= 0);
            System.out.println("MY number was :");
            System.out.println(num);
        
    }
}
