public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            System.out.println("Divide by zero");
            System.out.println(366 / 0);
            System.out.println("This");
            System.out.println("code");
            System.out.println("will not");
            System.out.println("be");
            System.out.println("executed");
        } catch (ArithmeticException e) {
            System.out.println("Program flow jumped to this catch block on line 5");
        }

    }
}
