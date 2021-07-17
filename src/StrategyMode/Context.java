package StrategyMode;

public class Context {
    private CashStrategy cashStrategy;

    public Context(CashStrategy cashStrategy) {
        this.cashStrategy = cashStrategy;
    }

    public double contextInterface(double money){
        return cashStrategy.strategyInterface(money);
    }

    public CashStrategy getCashStrategy() {
        return cashStrategy;
    }

    public void setCashStrategy(CashStrategy cashStrategy) {
        this.cashStrategy = cashStrategy;
    }
}
