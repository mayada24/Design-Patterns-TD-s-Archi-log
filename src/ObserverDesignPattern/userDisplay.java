package ObserverDesignPattern;

public class userDisplay implements Observer, Display {
    private float temprature;
    private float humidity;
    private Subject weatherData;

    public  userDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }
    @Override
    public void update(float temprature, float humidity, float pressure) {
        this.temprature = temprature;
        this.humidity = humidity;
        display();


    }

    @Override
    public void display() {
      System.out.println("Currents conditions: " + temprature+ "F degree and "+ humidity+"% humidity");
    }
}
