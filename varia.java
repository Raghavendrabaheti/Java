public class varia {
    static String name; // Declaring class-level variable
    static int marks;   // Declaring class-level variable

    public static void localVariable(){
        name = "Bus";
        marks = 95;
    }

    public static void nulocalvariable(){
        System.out.println(name + " second " + marks + "%");
    }

    public static void main(String[] args) {
        localVariable();
        nulocalvariable();
    }
}
