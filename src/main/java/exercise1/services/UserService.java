package exercise1.services;

import org.springframework.stereotype.Component;

/**
 * The UserService class implements the IUserService interface and provides functionality
 * for handling user-related operations.
 */
@Component
public class UserService implements IUserService {

    /**
     * {@inheritDoc}
     */
    @Override
    public void printUser(String message) {
        System.out.println("User: " + message);
    }
}
