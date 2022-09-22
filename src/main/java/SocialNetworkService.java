public class SocialNetworkService {
    private final Console console;
    private final Clock clock;

    public SocialNetworkService(Console console, Clock clock) {
        this.clock = clock;
        this.console = console;
    }

    public void readCommand(String command) {
        String userName = command.split(" ")[0];
        String action = command.split(" ")[1];
        if(action.equals("->")){
            String message = command.split("->")[1];
            Post post = new Post(userName,clock,message);
            post.postToWall();
        }
    }
}
