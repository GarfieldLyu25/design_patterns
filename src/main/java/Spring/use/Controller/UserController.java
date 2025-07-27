package Spring.use.Controller;

import Spring.frame.context.ApplicationContext;
import Spring.frame.context.support.ClassPathXmlApplicationContext;
import Spring.use.Service.UserService;

public class UserController {
    public static void main(String[] args) throws Exception {
        //创建spring容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从IOC容器中获取UserService对象
        UserService userService = applicationContext.getBean("userService", UserService.class);
        //调用UserService对象的add方法
        userService.add();
    }
}