public class Post {

    
    String user;
    Clock clock;
    String message;

    public Post(String user, Clock clock, String message) {
        this.user = user;
        this.clock = clock;
        this.message=message;
    }


    public void postToWall(Post post) {
        throw new UnsupportedOperationException();
    }
}
