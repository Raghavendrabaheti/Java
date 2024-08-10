import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int DBMS,DSA,DE,MATHS,SE;
        System.out.println("DBMS :");
        DBMS=sc.nextInt();
        System.out.println("DSA :");
        DSA=sc.nextInt();
        System.out.println("DE :");
        DE=sc.nextInt();
        System.out.println("MATHS :");
        MATHS=sc.nextInt();
        System.out.println("SE :");
        SE=sc.nextInt();
        int average=DBMS+DSA+DE+MATHS+SE/5;
        System.out.println("AVERAGE OF :");
        System.out.println(average);
       
    }
}
