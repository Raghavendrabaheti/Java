public class functions {
    public static int factorial(int num) {
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {

        int factN= factorial(5);
        int factR= factorial(3);
        int factNr= factorial(2);
        int NcR= factN/(factR * factNr);
        System.out.println(NcR);

    }
}
