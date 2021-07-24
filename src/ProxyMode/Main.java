package ProxyMode;

public class Main {
    public static void main(String[] args) {
        // 静态代理
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
