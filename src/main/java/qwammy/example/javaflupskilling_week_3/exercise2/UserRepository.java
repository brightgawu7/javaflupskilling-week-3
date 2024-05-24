package qwammy.example.javaflupskilling_week_3.exercise2;

import java.util.List;

/**
 * The UserRepository interface provides methods for performing CRUD operations on User objects.
 */
public interface UserRepository {

    /**
     * Retrieves a user by their unique identifier.
     *
     * @param id the unique identifier of the user
     * @return the user with the specified id, or null if no such user exists
     */
    User getUserById(Long id);

    /**
     * Retrieves a list of all users.
     *
     * @return a list of all users
     */
    List<User> getAllUsers();

    /**
     * Saves a user to the repository.
     *
     * @param user the user to be saved
     * @return the saved user
     */
    User saveUser(User user);
}
