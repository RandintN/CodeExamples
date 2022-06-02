public class Jarvis {
    public void sayHi(String... names) {
        for (String eachName : names) {
            System.out.println("Good morning, " + eachName + ", how are you doing?");
        }
    }

    public static void main(String[] args) {
        Jarvis jarvis = new Jarvis();
        jarvis.sayHi("Robson", "Viuva Negra");
    }
}
