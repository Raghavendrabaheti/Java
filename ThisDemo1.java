import java.util.Scanner;

public class ThisDemo1 {
    public static void main(String[] args) {
        String name;
        int rollno;
        float fee;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name");
        name= sc.nextLine();

        System.out.println("Enter Student fees");
        fee = sc.nextFloat();

        System.out.println("Enter Student rollno.");
        rollno = sc.nextInt();

        Demo demo = new Demo();
        demo.setValue(name,rollno,fee);
        // demo.getValue();
    }
}

class Demo {

    String name;
        int rollno;
        float fee;
        
        
    Demo(String name, int rollno, float fee){
        this.name=name;
        this.rollno=rollno;
        this.fee=fee;
    }
    void setValue(String name, int rollno, float fee){
        // System.out.println("The name is "+name+" Rollnumber is "+rollno+" Fees is " +fe);
        this.name=name;
        this.rollno=rollno;
        this.fee=fee;
    }

    // void getValue(){
    //     System.out.println("The name is "+name+" Rollnumber is "+rollno+" Fees is " +fee);

    // }
}
 
