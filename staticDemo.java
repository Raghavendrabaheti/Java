import java.Demo;

public class staticDemo {
    public static void main(String[] args) {
        // We can call static function using class name...//
        // DemoSt.show();
        Demo DemoSt= new Demo();  // it was also work //
        DemoSt.show();
    }
}

class DemoSt{
    static void show(){
        System.out.println("This is show Function");
    }
}
 // it was static funtion thats why it was run without creating object  //reduce time  ///

 // if it was non static function then it will not run without creating object//