package by.itacademy;

import java.util.List;

public class DefaultUserService implements UserService {

    private UserDao userDao = DefaultUserDao.getInstance();

    private static volatile UserService instance;

    public static UserService getInstance() {
        UserService localInstance = instance;
        if (localInstance == null) {
            synchronized (UserService.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new DefaultUserService();
                }
            }
        }
        return localInstance;
    }

    @Override
    public List<User> getStudents() {
        return userDao.getStudents();
    }

    @Override
    public String saveStudent(User user) {
        return userDao.save(user);
    }

    @Override
    public void saveAuthUser(AuthUser authUser) {

    }

}
