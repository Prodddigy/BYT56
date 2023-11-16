public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        WeatherControl weatherControl = new WeatherControl(1,1,1);

        System.out.println(weatherControl.humidity);

        weatherControl.changeState(new NeutralState(weatherControl));

        weatherControl.state.makeNeutral();


    }
}