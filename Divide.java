public class Divide {
    //simple code to print the division quotient of two integers
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("Divison of these 2 numbers is: " + c);
        }catch (Exception e) {
            System.out.println("Exception occured: " + e);
        }
    }
}
