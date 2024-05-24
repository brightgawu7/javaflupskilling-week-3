package qwammy.example.javaflupskilling_week_3.exercise3.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qwammy.example.javaflupskilling_week_3.exercise3.entities.User;
import qwammy.example.javaflupskilling_week_3.exercise3.services.IUserService;

import java.util.List;


/**
 * The UserController class provides REST endpoints for managing User objects.
 */
@RestController
@RequestMapping("/users")
@Tag(name = "User Controller")
public class UserController {

    private final IUserService userService;

    /**
     * Constructs a new UserController with the specified IUserService.
     *
     * @param userService the user service to be used by the controller
     */
    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    /**
     * Endpoint for creating a new user.
     *
     * @param user the user data to create
     * @return the created user
     */
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    /**
     * Endpoint for retrieving a user by their unique identifier.
     *
     * @param id the unique identifier of the user to retrieve
     * @return the user with the specified id, or null if not found
     */
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    /**
     * Endpoint for updating an existing user.
     *
     * @param id   the unique identifier of the user to update
     * @param user the updated user data
     * @return the updated user, or null if not found
     */
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    /**
     * Endpoint for deleting a user by their unique identifier.
     *
     * @param id the unique identifier of the user to delete
     * @return true if the user was deleted successfully, false otherwise
     */
    @DeleteMapping("/{id}")
    public boolean deleteUser(@PathVariable Long id) {
        return userService.deleteUser(id);
    }

    /**
     * Endpoint for retrieving all users.
     *
     * @return a list of all users
     */
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
