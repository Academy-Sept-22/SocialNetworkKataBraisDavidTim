import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class SocialNetworkServiceShould {

    SocialNetworkService socialNetworkService;
    @Mock
    Console console;
    @Mock
    Clock clock;
    @Mock
     Post post;

    @BeforeEach
    void setup(){
        socialNetworkService = new SocialNetworkService(console,clock);
    }

    @Test
    void recognise_post_command(){
        socialNetworkService.readCommand("Charlie -> Im in New York");
        verify(post).postToWall(post);
    }
}
