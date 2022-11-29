package TemplateMethodDesignPattern;


public abstract class HotDrinks {
    protected cupSize cupSize;
    public HotDrinks(cupSize cupSize){
        this.cupSize = cupSize;
    }



    protected abstract void getDescription();


}
