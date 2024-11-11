public class Dog extends Mammal{

    public Dog(String species) {
        super(species);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}
