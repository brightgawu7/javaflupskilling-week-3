package qwammy.example.javaflupskilling_week_3.exercise2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The UserServiceImp class implements the UserService interface, providing
 * methods for managing User objects.
 */
@Service
public class UserServiceImp implements UserService {
    private final UserRepository userRepository;

    /**
     * Constructs a new UserServiceImp with the specified UserRepository.
     *
     * @param userRepository the user repository to be used by the service
     */
    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User getUserById(Long id) {
        return userRepository.getUserById(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User createUser(User user) {
        return userRepository.saveUser(user);
    }
}
