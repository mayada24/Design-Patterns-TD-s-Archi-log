package TemplateMethodDesignPattern;

public class Tea extends HotDrinks{
    public Tea(TemplateMethodDesignPattern.cupSize cupSize) {
        super(cupSize);
    }

    @Override
    protected void getDescription() {

    }
}
