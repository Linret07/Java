package lessons.lesson2;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

class User {
    private int id;
    private String name;
    private int age;
    private Passport passport;
}
