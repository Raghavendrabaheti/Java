public class static_nonstatic {
    public static void main(String[] args) {
        
        Demo demo = new Demo();
        demo.show();
    }
}
// It gives Error because static non static no //

class Demo{
   static void show(){
        System.out.println("This is show function");
        display();
    }
    void display(){
        System.out.println("This is display function");
    }
}

// It gives Error because static non static no //