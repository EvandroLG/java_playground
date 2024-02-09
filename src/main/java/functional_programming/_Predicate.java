package functional_programming;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid.test("09000000000"));
        System.out.println(isPhoneNumberValid.test("090000000"));

        System.out.println(isPhoneNumberValid.and(contains).test("09000003000"));
    }

    static Predicate<String> isPhoneNumberValid = phoneNumber ->
            phoneNumber.startsWith("09") && phoneNumber.length() == 11;

    static Predicate<String> contains = phoneNumber ->
            phoneNumber.contains("3");
}
