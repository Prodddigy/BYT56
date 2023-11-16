public class NeutralState extends State{
    public NeutralState(WeatherControl weather) {
        super(weather);
    }

    @Override
    void makeRain() {

    }

    @Override
    void makeSunny() {

    }

    @Override
    void makeNeutral() {
        if(weather.humidity==1 && weather.temperature ==1 && weather.windForce==1)
        {
            weather.changeState(new NeutralState(weather));
        }
    }
}
