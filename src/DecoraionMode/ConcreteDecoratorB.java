package DecoraionMode;

public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Person component) {
        super(component);
    }

    @Override
    public void show() {
        System.out.println("裤子");
        super.show();
    }
}
