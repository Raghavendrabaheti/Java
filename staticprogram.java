public class staticprogram {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.show();
    }
}

class Demo{
    void show(){
        System.out.println("This is show function");
        display();
    }
    void display(){
        System.out.println("This is display function");
    }
}


// non static       non static          yes
// static           static              yes
// non static       static              yes
// static           non static          no