package exceptions;

public class Dog {
    private String name;
    private boolean isCollarPutOn;
    private boolean isLeashPutOn;
    private boolean isMuzzlePutOn;


    public Dog(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws DogIsNotReadyException {
        Dog dog = new Dog("Tarzan");
        dog.putCollar();
        dog.putLeash();
        dog.walk();
    }

    public void putCollar() {

        System.out.println("The collar is on!");
        this.isCollarPutOn = true;
    }

    public void putLeash() {

        System.out.println("The leash is on!");
        this.isLeashPutOn = true;
    }

    public void putMuzzle() {
        System.out.println("The muzzle is on!");
        this.isMuzzlePutOn = true;
    }

    public void walk() throws DogIsNotReadyException{

        System.out.println("We're getting ready for a walk!");
        if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn) {
            System.out.println("Hooray, let's go for a walk! " + name + " is very happy!");
        } else {
            throw new DogIsNotReadyException(name + "isn't ready for a walk");
        }
    }
}
