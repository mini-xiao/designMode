package FactoryMode;

public class Main {

    public static void main(String[] args) throws Exception{
        IFactory factory = new AddFactory();
        Operation operation = factory.createOperation();
        operation.setNum1(10);
        operation.setNum2(20);
        System.out.println(operation.GetResult());
    }
}
