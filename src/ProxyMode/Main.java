package ProxyMode;

public class Main {
    public static void main(String[] args) {
        // ้ๆไปฃ็
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
