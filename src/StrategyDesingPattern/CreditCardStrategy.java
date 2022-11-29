package StrategyDesingPattern;

// Strategy 1 can content an algorithm, changeable one.
public class CreditCardStrategy extends PaymentStrategy {
    private String name;
    private String cardCode;
    private String dateOfExpirty;

    public CreditCardStrategy(String name, String cardCode, String dateOfExpirty){
        this.name = name;
        this.cardCode = cardCode;
        this.dateOfExpirty = dateOfExpirty;
    }
    // Redefine the method
    @Override
    public void pay(int amount) {
        System.out.println(amount+"paid with credit card");
    }
}
