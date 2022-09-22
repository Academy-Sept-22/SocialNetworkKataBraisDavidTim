import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class UserShould {

	private User user;

	@Mock Post post;

	@BeforeEach
	void setup() {
		user = new User();
	}

	@Test
	public void
	user_should_be_able_post_to_their_wall() {
//		1. User sends message to wall
//		2. User sends message to Post
//		3. Post pushes message to wall
		user.postToWall("This is a new post to my wall");

//		post.pushPostToWall("This is a new post to my wall");

//		verify(user).postToWall(user);
		verify(post).pushPostToWall(post);

//		assertThat(user.getPosts().get(0)).isEqualTo("This is a new post to my wall");
	}

}