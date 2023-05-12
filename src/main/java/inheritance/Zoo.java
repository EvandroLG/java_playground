package inheritance;

public class Zoo {
    public static void main(String[] args) {
        Dog rocky = new Dog();
        System.out.println(rocky instanceof Animal);
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        Animal sasha = new Dog();
        sasha.makeSound();
        sasha = new Cat();
        sasha.makeSound();
        ((Cat)sasha).scratch();
        feed(sasha);
    }

    public static void feed(Animal animal) {
        if (animal instanceof  Dog) {
            System.out.println("Here is your dog food!");
        } else {
            System.out.println("Here is your cat food!");
        }
    }
}
