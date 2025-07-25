package pattern.proxy.CGLIB;

public class Client {
    public static void main(String[] args) {
        //jdk8能用
        //创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        //获取代理对象
        TrainStation proxyObject = factory.getProxyObject();

        proxyObject.sell();
    }
}
