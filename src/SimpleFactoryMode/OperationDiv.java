package SimpleFactoryMode;

public class OperationDiv extends Operation {
    @Override
    public double GetResult() throws Exception {
        if (getNum2() == 0) throw new Exception("除数不能为0");
        return getNum1() / getNum2();
    }
}
