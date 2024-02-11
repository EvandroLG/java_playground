package functional_programming;

import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class _Stream {

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

        Function<Person, Gender> personGenderFunction = person -> person.gender;
        Collector<Gender, ?, Set<Gender>> set = Collectors.toSet();
        Consumer<Gender> println = System.out::println;

        people.stream()
                .map(personGenderFunction)
                .collect(set)
                .forEach(println);

        boolean containsOnlyFemales = people.stream()
                .allMatch(Gender.FEMALE::equals);

        System.out.println(containsOnlyFemales);
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

    enum Gender { MALE, FEMALE };
}
