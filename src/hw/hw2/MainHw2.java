package hw.hw2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainHw2 {
    public static void main(String[] args) {
        User user = new User(
                1,
                "Leanne Graham",
                "Bret",
                "Sincere@april.biz",
                new Address("Kulas Light", "Apt. 556", "Gwenborough", "92998-3874",
                        new Geo(-37.3159, 81.1496)),
                "1-770-736-8031 x56442",
                "hildegard.org",
                new Company("Romaguera-Crona", "Multi-layered client-server neural-net", "harness real-time e-markets")
        );

        Employee employee = new Employee(
                1, "vasya", "pupkin", "asd@asd.com", 31, Gender.MALE,
                Arrays.asList(new Skill("java", 10), new Skill("js", 10), new Skill("c++", 10)),
                new Car("toyota", 2021, 250)
        );

        List<Post> posts = new ArrayList<>(Arrays.asList(
                new Post(1, 1, "First post", "Post body 1"),
                new Post(1, 2, "Second post", "Post body 2"),
                new Post(2, 3, "Third post", "Post body 3")
        ));

        List<Comment> comments = new ArrayList<>(Arrays.asList(
                new Comment(1, 1, "Commenter 1", "one@mail.com", "Comment for post 1"),
                new Comment(2, 2, "Commenter 2", "two@mail.com", "Comment for post 2"),
                new Comment(1, 3, "Commenter 3", "three@mail.com", "Another comment for post 1")
        ));

        for (Post post : posts) {
            for (Comment comment : comments) {
                if (post.getId() == comment.getPostId()) {
                    post.addComment(comment);
                }
            }
        }

        System.out.println("USER:");
        System.out.println(user);
        System.out.println("\nEMPLOYEE:");
        System.out.println(employee);
        System.out.println("\nPOSTS WITH COMMENTS:");
        for (Post post : posts) {
            System.out.println(post);
        }
    }
}
