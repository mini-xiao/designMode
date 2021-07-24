package DynamicProxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        Subject proxy = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(),
                new Class[]{Subject.class}, new DynamicProxy(realSubject));
        proxy.request();
    }
}
