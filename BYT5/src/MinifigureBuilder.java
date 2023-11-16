public class MinifigureBuilder implements Builder{
    private Minifigure minifigure;


    public MinifigureBuilder()
    {
        this.reset();
    }

    @Override
    public void reset() {
        this.minifigure = new Minifigure();
    }

    @Override
    public void setHead(String head) {
        this.minifigure.setHead(head);
    }

    @Override
    public void setLegs(String legs) {
        this.minifigure.setLegs(legs);
    }

    @Override
    public void setTorso(String torso) {
        this.minifigure.setTorso(torso);
    }

    @Override
    public void setAccessory(String acc) {
        this.minifigure.setAccessory(acc);
    }

    public Minifigure getFigurine()
    {
        Minifigure fig = this.minifigure;
        this.reset();
        return fig;
    }
}
