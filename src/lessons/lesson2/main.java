package lessons.lesson2;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

class Main {
    public static void main(String[] args) {
        User user = new User(1, "Sasha", 25, new Passport());
        Customer customer = new Customer();
    }
}
