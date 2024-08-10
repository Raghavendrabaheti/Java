public class nonstatic_static {
    public static void main(String[] args) {
        Demo demo = new Demo();    // object creation//
        demo.show();
    }
}

class Demo{
    void show(){
        System.out.println("This is show function");
        display();
    }
   static void display(){
        System.out.println("This is display function");
    }
}