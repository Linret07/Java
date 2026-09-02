package lessons.lesson2;


class Main {
    public static void main(String[] args) {
        Passport passport = new Passport("yhfghj@edfg", "123456789", "098563454545");
        User user = new User(1, "Sasha", 25, passport);
        User user2 = new User(2, "Sasha", 25, passport);
        Passport passport1 = user2.getPassport();

        Customer customer = new Customer();
        System.out.println(customer);
        System.out.println(user);
        System.out.println(user2);
        System.out.println(passport);
        System.out.println(passport1);
    }
}
