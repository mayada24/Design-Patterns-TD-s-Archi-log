package StrategyDesingPattern;

//Abstract class extends by 2 payments strategies, every strategy has a different algorithm
public abstract class PaymentStrategy {
    public abstract void pay(int amount);
}
