package DecoraionMode;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("小菜");
        Decorator a =new ConcreteDecoratorA();
        Decorator b =new ConcreteDecoratorB();

        a.Decorate(person);
        b.Decorate(a);
        b.show();
    }
}
