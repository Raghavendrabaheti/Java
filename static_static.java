public class static_static {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.show();
    }
}

class Demo{
   static void show(){
        System.out.println("This is show function");
        display();
    }
   static void display(){
        System.out.println("This is display function");
    }
}
