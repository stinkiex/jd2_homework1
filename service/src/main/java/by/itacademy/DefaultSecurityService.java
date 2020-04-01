package by.itacademy;

public class DefaultSecurityService implements SecurityService {
    private AuthUserDao authUserDao = DefaultAuthUserDao.getInstance();

    private static volatile SecurityService instance;

    public static SecurityService getInstance() {
        SecurityService localInstance = instance;
        if (localInstance == null) {
            synchronized (SecurityService.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new DefaultSecurityService();
                }
            }
        }
        return localInstance;
    }

    public AuthUser login(String login, String password) {
        AuthUser user = authUserDao.getByLogin(login);
        if (user == null) {
            return null;
        }
        if (user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public static boolean checkAlreadyExistsUser(String login){
        boolean flag = false;
        DefaultAuthUserDao defaultAuthUserDao = new DefaultAuthUserDao();
        if(defaultAuthUserDao.userByLogin.containsKey(login)) {
            flag = true;
        }
        return flag;
    }

    public static void createUser(String login, String password){
        if (checkAlreadyExistsUser(login) == false) {
            DefaultAuthUserDao defaultAuthUserDao = new DefaultAuthUserDao();
            defaultAuthUserDao.userByLogin.putIfAbsent(login, new AuthUser(login, password, Role.STUDENT, null));
        }
    }
}
