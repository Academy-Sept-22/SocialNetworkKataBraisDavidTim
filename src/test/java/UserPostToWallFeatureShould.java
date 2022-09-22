import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserPostToWallFeatureShould {

	@Test
	public void allow_a_user_to_post_to_their_wall() {
		User user = new User();
		Post post = new Post("This is a new post to my wall", user);

		assertThat(user.getPosts().get(0)).isEqualTo("This is a new post to my wall");
	}
}
