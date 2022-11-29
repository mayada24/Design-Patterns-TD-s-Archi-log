package StrategyDesingPattern;

// Strategy 2 can content another algorithm, changeable one.
public class PayseraStrategy extends PaymentStrategy {
    private String email;
    private String password;

    public PayseraStrategy(String email, String password){
        this.email = email;
        this.password = password;
    }
    // Redefine the method
    @Override
    public void pay(int amount) {
        System.out.println(amount+"paid using Paysera");
    }
}
