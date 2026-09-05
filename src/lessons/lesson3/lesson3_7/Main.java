package lessons.lesson3.lesson3_7;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        BiFunction<User, Customer, Admin> biFunction =
                (user, customer) -> new Admin(
                        user.getName(),
                        customer.getLogin(),
                        customer.getPassword()
                );

        Admin apply = biFunction.apply(
                new User("vasya"),
                new Customer("asd", "qwe")
        );

        System.out.println(apply);
    }
}
