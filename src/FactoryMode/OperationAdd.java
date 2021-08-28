package FactoryMode;

public class OperationAdd extends Operation {
    @Override
    public double GetResult() {
        return getNum1() + getNum2();
    }
}
