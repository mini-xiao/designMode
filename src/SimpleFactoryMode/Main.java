package SimpleFactoryMode;

public class Main {
    public static void main(String[] args) throws Exception {
        Operation oper = SimpleFactory.createOperate("+");
        oper.setNum1(2);
        oper.setNum2(0);
        System.out.println(oper.GetResult());
    }
}
