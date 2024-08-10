public class name {
    public static void main(String[] args) {
        String name = "Raghav";
        
        // Print the name in stars
        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            switch (Character.toLowerCase(letter)) {
                case 'r':
                    System.out.println("*****");
                    System.out.println("*    *");
                    System.out.println("*****");
                    System.out.println("* *");
                    System.out.println("*  *");
                    System.out.println("*    *");
                    break;
                case 'a':
                    System.out.println("  ***  ");
                    System.out.println(" *   * ");
                    System.out.println("*     *");
                    System.out.println("*******");
                    System.out.println("*     *");
                    break;
                case 'g':
                    System.out.println("  **** ");
                    System.out.println(" *     ");
                    System.out.println("*  *** ");
                    System.out.println("*     *");
                    System.out.println(" *   * ");
                    System.out.println("  ***  ");
                    break;
                case 'h':
                    System.out.println("*    *");
                    System.out.println("*    *");
                    System.out.println("******");
                    System.out.println("*    *");
                    System.out.println("*    *");
                    break;
                case 'v':
                    System.out.println("*     *");
                    System.out.println(" *   * ");
                    System.out.println("  * *  ");
                    System.out.println("   *   ");
                    break;
                default:
                    System.out.println("Invalid character");
                    break;
            }
            System.out.println(); // Add a line break between letters
        }
    }
}
