package functional_programming;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Evandro", Gender.MALE),
                new Person("Sophia", Gender.FEMALE),
                new Person("Liam", Gender.MALE),
                new Person("Isabella", Gender.FEMALE),
                new Person("Mateo", Gender.MALE),
                new Person("Olivia", Gender.FEMALE),
                new Person("Ethan", Gender.MALE),
                new Person("Emma", Gender.FEMALE),
                new Person("Gabriel", Gender.MALE),
                new Person("Ava", Gender.FEMALE)
        );

        Predicate<Person> filterByGender = (person) -> person.gender.equals(Gender.FEMALE);

        people.stream()
                .filter(filterByGender)
                .toList()
                .forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender { MALE, FEMALE }
}
