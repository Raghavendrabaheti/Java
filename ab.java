// package oops;
public class ab {
    public static void main(String[] args) {
        T objT = new T(10,20);
        T objT1 = new T(9,4);
        S objS = new S();
        S objS1 = new S();
    }
}
class S{
    S(){
        System.out.println("Constructor of class S");
    }
}
class T{
    T(int x, int y){
        System.out.println("Constructor of class T "+x+"\n"+"The value of Y is " +y);
    }
}