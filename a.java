package oops;
import java.util.Scanner;
public class a {
    public static void main(String[] args) {
        // b obja = new b();
        // c obja1 = new c();

        // obja.display();
        // obja.show();
        
        // obja1.display();
        // obja1.show();
        // addition with object//
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = sc.nextDouble();
        int sum=x+y;
        System.out.println(sum);
        // Q objQ = new Q();
        // objQ.add(x,y);
        // objQ.sub(x,y);
        // objQ.multi(x,y);
        // objQ.div(x,y);
    }
}
class Q{
    void add (int x, int y){
        System.out.println(x+y);
    }
    void sub(int x,int y){
        System.out.println(x-y);
    }
    void multi(int x,int y){
        System.out.println(x*y);
    }
    void div(int x ,int y){
        System.out.println(x/y);
    }
}