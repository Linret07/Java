package lessons.lesson3.lesson3_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Singer> singers = new ArrayList<>();
//        singers.add(new Student());
//        singers.add(new User());
//
//        Singer singer = singers.get(0);
//        singer.sing();
      Singer singer1 = new Singer() {
          @Override
          public void sing() {
              System.out.println("singing");
          }
      };

      Singer singer2 = new Singer() {
          @Override
          public void sing() {
              System.out.println("lalala");
          }
      };

      Singer singer3 = new Singer() {
          @Override
          public void sing() {
              System.out.println("ololo");
          }
      };
    }
}
