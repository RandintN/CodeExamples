public class DivideByZero {

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    private static void divideByZero() throws ArithmeticException {
        Integer result = 50 / 0;
    }
}