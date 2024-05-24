package qwammy.example.javaflupskilling_week_3.exercise2;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

/**
 * Test class for UserServiceImp.
 */
@SpringBootTest
class UserServiceImpTest {

    @Autowired
    private UserService userService;

    @MockBean
    private UserRepository userRepository;

    private User user1;
    private User user2;

    /**
     * Sets up the test data before each test.
     */
    @BeforeEach
    void setUp() {
        user1 = User.builder()
                .id(1L)
                .name("Edem")
                .build();

        user2 = User.builder()
                .id(2L)
                .name("Bright")
                .build();
    }

    /**
     * Tests the getUserById method.
     */
    @Test
    void getUserById() {
        when(userRepository.getUserById(1L)).thenReturn(user1);

        User actualUser = userService.getUserById(1L);
        assertEquals(user1, actualUser);
    }

    /**
     * Tests the getAllUsers method.
     */
    @Test
    void getAllUsers() {
        when(userRepository.getAllUsers()).thenReturn(Arrays.asList(user1, user2));

        List<User> users = userService.getAllUsers();
        assertEquals(2, users.size());
        assertEquals(user1, users.get(0));
        assertEquals(user2, users.get(1));
    }

    /**
     * Tests the createUser method.
     */
    @Test
    void createUser() {
        when(userRepository.saveUser(any(User.class))).thenReturn(user1);

        User createdUser = userService.createUser(user1);
        assertEquals(user1, createdUser);
    }
}
