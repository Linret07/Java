package hw.hw1;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Post {
    private int userId;
    private int id;
    private String title;
    private String body;

    public Post(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    @Override
    public String toString(){
        return "Post{" + "userId=" + userId + ", title=" + title + ", body=" + body + '}';
    }

    static void main() {
        List<Post> posts = new ArrayList<>();
        posts.add(new Post(1, 1, "Title 1", "Body text 1"));
        posts.add(new Post(1, 2, "Title 2", "Body text 2"));
        posts.add(new Post(2, 3, "Title 3", "Body text 3"));
        posts.add(new Post(2, 4, "Title 4", "Body text 4"));
        posts.add(new Post(3, 5, "Title 5", "Body text 5"));

        for (Post post : posts) {
            System.out.println(post);
        }
    }
}
