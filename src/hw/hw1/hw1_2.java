package hw.hw1;

class Comments {
    private int postId;
    private  int id;
    private String name;
    private String email;
    private String body;

    public Comments(int postId, String body, String email, String name, int id) {
        this.postId = postId;
        this.id = id;
        this.body = body;
        this.email = email;
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBody(String body) {
        this.body = body;
    }
    @Override
    public String toString() {
        return "Comments{" +
                "postId=" + postId +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
class Main1{
    public static void main(String[] args) {
        Comments[] commentList = new Comments[]{
                new Comments(1, "hello", "user2@mail.com", "User 2", 2),
                new Comments(1, "hello1", "user3@mail.com", "User 3", 5),
                new Comments(1, "hello2", "user4@mail.com", "User 4", 3),
                new Comments(1, "hello3", "user5@mail.com", "User 5", 4),
                new Comments(1, "hello4", "user6@mail.com", "User 6", 4)
        };

        for (Comments comment : commentList) {
            System.out.println(comment);
        }
    }
}
