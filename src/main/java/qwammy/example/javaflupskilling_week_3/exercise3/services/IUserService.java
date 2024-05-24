package qwammy.example.javaflupskilling_week_3.exercise3.services;

import qwammy.example.javaflupskilling_week_3.exercise3.entities.User;

import java.util.List;

/**
 * The IUserService interface provides methods for managing User objects.
 */
public interface IUserService {

    /**
     * Creates a new user.
     *
     * @param user the user to be created
     * @return the created user
     */
    User createUser(User user);

    /**
     * Retrieves a user by their unique identifier.
     *
     * @param id the unique identifier of the user
     * @return the user with the specified id, or null if no such user exists
     */
    User getUserById(Long id);

    /**
     * Updates an existing user.
     *
     * @param id   the unique identifier of the user to be updated
     * @param user the user data to update
     * @return the updated user, or null if no such user exists
     */
    User updateUser(Long id, User user);

    /**
     * Deletes a user by their unique identifier.
     *
     * @param id the unique identifier of the user to be deleted
     * @return true if the user was successfully deleted, false otherwise
     */
    boolean deleteUser(Long id);

    /**
     * Retrieves a list of all users.
     *
     * @return a list of all users
     */
    List<User> getAllUsers();
}
