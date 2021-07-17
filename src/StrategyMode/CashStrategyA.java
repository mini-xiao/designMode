package StrategyMode;

public class CashStrategyA implements CashStrategy {
    @Override
    public double strategyInterface(double money) {
        return money;
    }
}
