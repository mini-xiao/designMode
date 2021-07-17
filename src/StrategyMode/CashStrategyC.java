package StrategyMode;

import java.lang.reflect.Member;

public class CashStrategyC implements CashStrategy {
    private double condition = 0;
    private double returnMoney = 0;

    public CashStrategyC(double condition, double returnMoney) {
        this.condition = condition;
        this.returnMoney = returnMoney;
    }

    @Override
    public double strategyInterface(double money) {
        if (money >= condition) money = money - Math.floor(money / condition) * returnMoney;
        return money;
    }
}
