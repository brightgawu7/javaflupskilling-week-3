package qwammy.example.javaflupskilling_week_3.exercise3.repositories;

import org.springframework.stereotype.Repository;
import qwammy.example.javaflupskilling_week_3.exercise3.entities.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The UserRepository class implements the IUserRepository interface,
 * providing methods for performing CRUD operations on User objects.
 */
@Repository
public class UserRepository implements IUserRepository {
    private final Map<Long, User> userStore = new HashMap<>();
    private long currentId = 1;

    /**
     * {@inheritDoc}
     */
    @Override
    public User getById(Long id) {
        return userStore.get(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User save(User user) {
        user.setId(currentId++);
        userStore.put(user.getId(), user);
        return user;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<User> findAll() {
        return new ArrayList<>(userStore.values());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User update(Long currentId, User user) {
        if (userStore.containsKey(currentId)) {
            user.setId(currentId);
            userStore.put(currentId, user);
            return user;
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean delete(Long id) {
        return userStore.remove(id) != null;
    }
}
