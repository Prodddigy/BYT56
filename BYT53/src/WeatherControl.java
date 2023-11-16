public class WeatherControl {

    public State state;
    public int humidity;

    public int temperature;
    public int windForce;

    public WeatherControl()
    {
        this.state = new NeutralState(this);
    }
    WeatherControl(int humidity,int temperature, int windForce)
    {
        this.temperature = temperature;
        this.windForce = windForce;
        this.humidity = humidity;
    }

    public void changeState(State state)
    {
        this.state=state;
    }

}
