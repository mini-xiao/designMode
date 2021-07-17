package StrategyMode;

public class Main {
    public static void main(String[] args) {
        Context context = null;
        String strategy = "满300减100";
        switch (strategy){
            case "满300减100" :context =new Context(new CashStrategyC(300,100)); break;
            case "打8折" :context =new Context(new CashStrategyB(0.8)); break;
            default:context =new Context(new CashStrategyA()); break;
        }
        System.out.println(context.contextInterface(600));
    }

}
