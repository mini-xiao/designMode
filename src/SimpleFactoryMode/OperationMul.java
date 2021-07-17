package SimpleFactoryMode;

public class OperationMul extends Operation {
    @Override
    public double GetResult() {
        return getNum1() * getNum2();
    }
}
