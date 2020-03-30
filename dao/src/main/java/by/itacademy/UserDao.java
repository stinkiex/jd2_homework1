package by.itacademy;

import java.util.List;

public interface UserDao {
    List<User> getStudents();

    String save(User user);
}
