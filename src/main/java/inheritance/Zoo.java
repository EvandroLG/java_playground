package inheritance;

public class Zoo {
    public static void main(String[] args) {
        Dog rocky = new Dog();
        System.out.println(rocky instanceof Animal);
        rocky.fetch();
        rocky.makeSound();

        Animal sasha = new Dog();
        sasha.makeSound();
        sasha = new Cat();
        sasha.makeSound();
        ((Cat)sasha).scratch();
    }
}
