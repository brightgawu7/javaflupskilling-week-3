package qwammy.example.javaflupskilling_week_3.exercise2;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The UserRepositoryImp class implements the UserRepository interface and provides
 * the actual data access logic for user-related operations.
 */
@Repository
public class UserRepositoryImp implements UserRepository {

    /**
     * {@inheritDoc}
     */
    @Override
    public User getUserById(Long id) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<User> getAllUsers() {
        return List.of();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User saveUser(User user) {
        return null;
    }
}
