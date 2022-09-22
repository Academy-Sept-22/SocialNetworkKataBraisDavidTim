public class Post {
    String user;
    Clock clock;
    String message;

    public Post(String user, Clock clock, String message) {
        this.user = user;
        this.clock = clock;
        this.message=message;
    }

//    public Post() {
//
//    }


    public void postToWall() {
        new Post(user, clock, message);
        System.out.println("Posted");
    }
}
