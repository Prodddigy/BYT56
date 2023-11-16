public class Director {
    public void constructHorrorGame(Builder builder) {


        builder.reset();
        builder.setFigurines(8);
        builder.setBoard("medium");
        builder.setCards(50);
        builder.setDices(5);
    }
    public void constructWarGame(Builder builder)
    {
        builder.reset();
        builder.setFigurines(100);
        builder.setBoard("huge");
        builder.setCards(150);
        builder.setDices(50);
    }
}
