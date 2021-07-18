package DecoraionMode;

public class ConcreteDecoratorA extends Decorator {

    @Override
    public void show() {
        System.out.println("大T恤");
        super.show();
    }
}
