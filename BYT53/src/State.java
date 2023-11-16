abstract class State {

    protected WeatherControl weather;
    public State(WeatherControl weather)
    {
        this.weather = weather;
    }

    abstract void makeRain();
    abstract void makeSunny();

    abstract void makeNeutral();

}
