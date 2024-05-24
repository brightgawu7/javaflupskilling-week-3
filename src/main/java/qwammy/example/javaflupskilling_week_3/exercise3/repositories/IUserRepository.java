package qwammy.example.javaflupskilling_week_3.exercise3.repositories;

import qwammy.example.javaflupskilling_week_3.exercise3.entities.User;

import java.util.List;

/**
 * The IUserRepository interface provides methods for performing CRUD operations on User objects.
 */
public interface IUserRepository {

    /**
     * Retrieves a user by their unique identifier.
     *
     * @param id the unique identifier of the user
     * @return the user with the specified id, or null if no such user exists
     */
    User getById(Long id);

    /**
     * Saves a user to the repository.
     *
     * @param user the user to be saved
     * @return the saved user
     */
    User save(User user);

    /**
     * Retrieves a list of all users.
     *
     * @return a list of all users
     */
    List<User> findAll();

    /**
     * Updates the user with the specified id.
     *
     * @param id   the unique identifier of the user to be updated
     * @param user the user data to update
     * @return the updated user, or null if no such user exists
     */
    User update(Long id, User user);

    /**
     * Deletes the user with the specified id.
     *
     * @param id the unique identifier of the user to be deleted
     * @return true if the user was successfully deleted, false otherwise
     */
    boolean delete(Long id);
}
