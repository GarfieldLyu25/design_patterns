package Spring.frame.context;

import Spring.frame.beans.factory.BeanFactory;

public interface ApplicationContext extends BeanFactory {
    //进行配置文件加载并进行对象创建
    void refresh() throws IllegalStateException, Exception;
}
