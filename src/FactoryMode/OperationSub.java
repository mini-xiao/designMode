package FactoryMode;

public class OperationSub extends Operation {
    @Override
    public double GetResult() {
        return getNum1() - getNum2();
    }
}
