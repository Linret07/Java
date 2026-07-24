package lessons.lesson1.lesson1_2;
import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
   int id;
            //byte
            //short
            //int
            //long
   String name;
            //string
  boolean status;
                    //boolean
   double weight;
                    //double

    public String greetng(String msg){
        return msg + " my name is - " + this.name;
    }
}
