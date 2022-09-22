import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserPostToWallFeatureShould {
    @Mock
    private Console console;

    @Mock
    private Clock clock;

    SocialNetworkService socialNetworkService = new SocialNetworkService(console, clock);

    @Test
    public void print_a_users_wall_when_requested() {
        when(clock.now()).thenReturn(new Date());
        socialNetworkService.readCommand("Charlie -> Have a great day");

        when(clock.now()).thenReturn(new Date(1));

        socialNetworkService.readCommand("Charlie wall");

        verify(console).printLine("Charlie - Have a great day (1 second ago)");
    }
}
