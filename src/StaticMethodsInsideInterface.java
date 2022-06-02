public interface StaticMethodsInsideInterface {
    void demo();

    static void display() {
        System.out.println("This is a static method inside an interface. Available since Java 8");
    }
}

class InterfaceExample implements StaticMethodsInsideInterface{

    @Override
    public void demo() {
        System.out.println("This is an implementation of the the demo method");
    }

    public static void main(String[] args) {
        InterfaceExample interfaceExample = new InterfaceExample();
        interfaceExample.demo();

        StaticMethodsInsideInterface.display(); // Just call it like a normal static method
    }
}
