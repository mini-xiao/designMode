package DecoraionMode;

public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Person component) {
        super(component);
    }

    @Override
    public void show() {
        System.out.println("大T恤");
        super.show();
    }
}
