package combinator_pattern;

import java.time.LocalDate;

import static combinator_pattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Evandro",
                "my-email@my-email.com",
                "+06883133",
                LocalDate.of(1986, 11, 03)
        );

        CustomerValidator validator = new CustomerValidator();
        System.out.println(validator.isValid(customer));

        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);

        System.out.println(result);
    }
}
