package lessons.lesson2;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Passport {
    private String email;
    private String address;
    private String phoneNumber;
}
