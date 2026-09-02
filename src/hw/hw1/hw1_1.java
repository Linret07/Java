package hw.hw1;

class Posts {
    private int userId;
    private int id;
    private String title;
    private String body;

    public Posts(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public int getUserId() {
        return userId;
    }

    public String getBody() {
        return body;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Posts{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
    class Main{
        public static void main(String[] args) {
            Posts[] posts = new Posts[]{
                    new Posts(1, 1, "title1", "body"),
                    new Posts(1, 2, "title2", "body"),
                    new Posts(1, 3, "title3", "body"),
                    new Posts(1, 4, "title4", "body"),
                    new Posts(1, 5, "title5", "body")
            };

            for (Posts post : posts) {
                System.out.println(post);
            }
        }
    }

