public class BoardgameInstructionBuilder implements Builder{

    private Instruction instruction;

    BoardgameInstructionBuilder()
    {
        this.reset();
    }
    @Override
    public void reset() {
        this.instruction = new Instruction();
    }

    @Override
    public void setFigurines(int fig) {
        instruction.setFigurines(fig);
    }

    @Override
    public void setBoard(String board) {
        instruction.setBoard(board);
    }

    @Override
    public void setCards(int cards) {
        instruction.setCards(cards);
    }

    @Override
    public void setDices(int dices) {
        instruction.setDices(dices);
    }
    public Instruction getItem()
    {
        Instruction item = this.instruction;
        this.reset();
        return item;
    }
}
