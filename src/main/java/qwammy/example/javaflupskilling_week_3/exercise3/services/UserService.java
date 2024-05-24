package qwammy.example.javaflupskilling_week_3.exercise3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qwammy.example.javaflupskilling_week_3.exercise3.entities.User;
import qwammy.example.javaflupskilling_week_3.exercise3.repositories.IUserRepository;

import java.util.List;

/**
 * The UserService class implements the IUserService interface, providing
 * methods for managing User objects.
 */
@Service
public class UserService implements IUserService {
    private final IUserRepository userRepository;

    /**
     * Constructs a new UserService with the specified IUserRepository.
     *
     * @param userRepository the user repository to be used by the service
     */
    @Autowired
    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User getUserById(Long id) {
        return userRepository.getById(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User updateUser(Long id, User user) {
        return userRepository.update(id, user);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean deleteUser(Long id) {
        return userRepository.delete(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
