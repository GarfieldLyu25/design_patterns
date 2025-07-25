package pattern.proxy.jdk;

import pattern.proxy.staticproxy.SellTickets;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        //获取代理对象
        ProxyFactory factory = new ProxyFactory();

        SellTickets proxyObject = factory.getProxyObject();
        proxyObject.sell();

        //arthas
        System.out.println(proxyObject.getClass());
        System.in.read();
    }
}
