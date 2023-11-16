public class BoardgameBuilder implements Builder
{

private Boardgame boardgame;

    BoardgameBuilder()
    {
        this.reset();
    }
    @Override
    public void reset() {
        this.boardgame = new Boardgame();
    }

    @Override
    public void setFigurines(int fig) {
        boardgame.setFigurines(fig);
    }

    @Override
    public void setBoard(String board) {
        boardgame.setBoard(board);
    }

    @Override
    public void setCards(int cards) {
        boardgame.setCards(cards);
    }

    @Override
    public void setDices(int dices) {
        boardgame.setDices(dices);
    }

    public Boardgame getItem()
    {
       Boardgame item = this.boardgame;
        this.reset();
        return item;
    }
}
