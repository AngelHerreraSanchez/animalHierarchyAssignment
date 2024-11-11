public class Zoo {

    public static void main(String[] args) {
        Animal bird1 = new Bird("Bird");
        Animal mammal1 = new Mammal("Mammal");
        Animal dog1 = new Dog("Mammal");
        makeSound(bird1);
        makeSound(mammal1);
        makeSound(dog1);
    }

    public static  void  makeSound (Animal animal){
        animal.makeSound();
    }
}
