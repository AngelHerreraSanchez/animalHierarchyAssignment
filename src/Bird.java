public class Bird extends Animal{

    public Bird(String species){
        super(species);
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp Chirp");
    }
}
