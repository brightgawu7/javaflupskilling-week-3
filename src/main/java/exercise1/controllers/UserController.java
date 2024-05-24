package exercise1.controllers;

import exercise1.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * The UserController class is responsible for handling user-related operations.
 */
@Component
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
     * Prints user information using the injected IUserService.
     */
    public void printUser() {
        userService.printUser("Bright Edem Gawu");
    }
}
