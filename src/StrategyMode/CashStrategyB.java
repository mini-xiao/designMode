package StrategyMode;

public class CashStrategyB implements CashStrategy {
    private double rebate;

    public CashStrategyB(double rebate) {
        this.rebate = rebate;
    }

    @Override
    public double strategyInterface(double money) {
        return money * rebate;
    }

}
