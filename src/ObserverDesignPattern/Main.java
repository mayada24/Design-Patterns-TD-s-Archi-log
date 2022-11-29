package ObserverDesignPattern;

public class Main {

    public static void main (String[]args){
        WeatherData weatherData = new WeatherData();
        userDisplay userDisplay = new userDisplay(weatherData);

        weatherData.setweather(80, 65, 30.2f);


    }
}
