package lessons.lesson4.lesson4_5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        strings.add("asdqwe");
        strings.add("asd");
        strings.add("qwe");
        strings.add("okten");
        System.out.println(strings);

        HashSet<User> users = new HashSet<>();
        users.add(new User(2, "kokos"));
        users.add(new User(1, "ananas"));
        users.add(new User(1, "ananas"));
        users.add(new User(3, "banan"));
        users.add(new User(5, "tomat"));
        users.add(new User(4, "potatos"));
        users.add(new User(4, "potatos"));
        users.add(new User(6, "mango"));
        System.out.println(users);

        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User next = iterator.next();
            if (next.getId() == 2) {
                iterator.remove();
            }
        }

        Stream<User> stream = users.stream();
        List<User> collect = stream
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
