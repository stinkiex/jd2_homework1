public interface AuthUserDao {
    AuthUser getByLogin(String login);

    void saveAuthUser(AuthUser user);
}
