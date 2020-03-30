import java.util.List;

public interface UserService {
    List<User> getStudents();

    String saveStudent(User user);

    void saveAuthUser(AuthUser authUser);
}
