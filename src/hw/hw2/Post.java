package hw.hw2;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private final int userId;
    private final int id;
    private final String title;
    private final String body;
    private final List<Comment> comments = new ArrayList<>();

    public Post(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    @Override
    public String toString() {
        return "Post{userId=" + userId + ", id=" + id +
                ", title='" + title + '\'' + ", body='" + body + '\'' +
                ", comments=" + comments + '}';
    }
}
