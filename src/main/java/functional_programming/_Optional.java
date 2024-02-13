package functional_programming;

import java.util.Optional;

public class _Optional {
    public static void main(String[] args) {
        Optional.ofNullable("evandrolg")
                .ifPresentOrElse(
                        value -> System.out.println("Your username is " + value),
                        () -> System.out.println("No user found!")
                );
    }
}
