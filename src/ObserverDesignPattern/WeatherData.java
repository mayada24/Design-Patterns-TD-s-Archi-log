package ObserverDesignPattern;

import java.util.ArrayList;

public class WeatherData implements Subject {
    //We have method called any time new measurement data is available
    private ArrayList<Observer>observers;
    private float temprature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    public void weatherChange(){
        notifyobservers();
    }

    public void setweather(float temprature, float humidity, float pressure){
        this.temprature = temprature;
        this.humidity = humidity;
        this.pressure = pressure;
        weatherChange();
    }



    @Override
    public void addObserver(Observer o) {
      observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i>=0){
            observers.remove(o);
        }
    }

    @Override
    public void notifyobservers() {
        for(Observer observer: observers){
            observer.update(temprature, humidity, pressure);
        }
    }
}
