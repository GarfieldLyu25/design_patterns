package Spring.use.Dao.Impl;

import Spring.use.Dao.UserDao;

public class UserDaoImpl implements UserDao {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void add() {
        System.out.println(getUsername()+getPassword());
    }
}
