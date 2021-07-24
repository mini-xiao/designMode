package ProxyMode;

public class Proxy extends Subject {
    public Subject realSubject;

    public Proxy(final Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        System.out.println("执行方法前");
        realSubject.request();
        System.out.println("执行方法后");
    }

}
