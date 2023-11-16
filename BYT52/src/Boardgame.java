public class Boardgame {
    public int getFigurines() {
        return figurines;
    }

    public void setFigurines(int figurines) {
        this.figurines = figurines;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public int getCards() {
        return cards;
    }

    public void setCards(int cards) {
        this.cards = cards;
    }

    public int getDices() {
        return dices;
    }

    public void setDices(int dices) {
        this.dices = dices;
    }

    private int figurines;
    private String board;
    private int cards;
    private int dices;

    public Boardgame() {

    }
}
