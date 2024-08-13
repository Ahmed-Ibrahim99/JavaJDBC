package service;

import model.User;
import repository.UserRepository;
import java.util.List;

public class UserService {
    private final UserRepository userRepository = new UserRepository();

    public void createUser(User user) {
        userRepository.createUser(user);
    }

    public User getUserById(int id) {
        return userRepository.getUserById(id);
    }

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public void updateUser(User user) {
        userRepository.updateUser(user);
    }

    public void deleteUser(int id) {
        userRepository.deleteUser(id);
    }
}
