public class RainState extends State{
    public RainState(WeatherControl weather) {
        super(weather);
    }

    @Override
    void makeRain() {
        if(weather.humidity>5)
        {
            weather.changeState(new RainState(weather));
        }
    }

    @Override
    void makeSunny() {

    }

    @Override
    void makeNeutral() {

    }
}
