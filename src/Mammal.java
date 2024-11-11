public class Mammal extends Animal{

    public Mammal(String species){
        super(species);
    }

    @Override
    public void makeSound() {
        System.out.println("Some mammal sound");
    }
}
