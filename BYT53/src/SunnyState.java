public class SunnyState extends State{
    public SunnyState(WeatherControl weather) {
        super(weather);
    }

    @Override
    void makeRain() {

    }

    @Override
    void makeSunny() {
        if(weather.temperature>8)
        {
            weather.changeState(new SunnyState(weather));
        }
    }

    @Override
    void makeNeutral() {

    }
}
