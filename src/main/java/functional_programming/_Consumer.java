package functional_programming;

import java.util.function.BiConsumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer evandro = new Customer("Evandro", "9999-999");
        greetCustomerCosumer.accept(evandro, false);
    }

    static BiConsumer<Customer, Boolean> greetCustomerCosumer =
            (customer, shouldShowPhoneNumber) ->
                System.out.println("Hello " + customer.name +
                    ", thanks for registering the phone number " +
                        (shouldShowPhoneNumber ? customer.phoneNumber :
                                "*****-" + customer.phoneNumber.substring(customer.phoneNumber.length() - 3)));

    static class Customer {
        String name;
        String phoneNumber;

        Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }
}
