package oops;
public class funct {
    public static void main(String[] args) {
        Fun1 objFun1 = new Fun1();
        objFun1.Show();
        objFun1.noshowno();
        objFun1.noshowyes(3);
        // objFun1.display();

        int y = objFun1.yesshowno();
        System.out.println("VAlue of y is " + y);

        int add = objFun1.yesshowyes(10, 20);
        System.out.println("VAlue of add is " + add);
    }
}

class Fun1 {
    void Show() {

        System.out.println("this is Show Function");
        display();

    }

    void display() {
        Fun2 objFun2 = new Fun2();
        System.out.println("This is display Function");
        objFun2.show(13);
        objFun2.hellofunction();
    }
    void noshowno(){
        System.out.println("This is noshowsno"); //no return no parameters//
    }
    void noshowyes(int x){                  //parameter= arguments//
        
        System.out.println("this is noshowsyes "+x); // no return with parameters//
    }
    int yesshowno(){
        int y=40;   //return with no parameters//
        return y;
    
    }
    int yesshowyes(int x,int y){
        int z;      //return with parameters//
        z=x+y;
        return z;
    }
}

class Fun2 {
    void show(int x) {
        System.out.println("value of x is " + x);
    }

    void hellofunction() {
        System.out.println("this is function 2");
    }
}