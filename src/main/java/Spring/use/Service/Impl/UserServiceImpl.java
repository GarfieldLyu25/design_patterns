package Spring.use.Service.Impl;

import Spring.use.Dao.UserDao;
import Spring.use.Service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("userServiceImpl ...");
        userDao.add();
    }
}
