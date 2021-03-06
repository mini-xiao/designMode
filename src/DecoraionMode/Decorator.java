package DecoraionMode;

public abstract class Decorator extends Person{

    private Person component;

    public void Decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            this.component.show();
        }
    }
}
