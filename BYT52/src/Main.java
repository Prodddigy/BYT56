public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        makeBoardGame();
    }


    public static void makeBoardGame() {
        Director director = new Director();

        BoardgameBuilder builder = new BoardgameBuilder();
        director.constructHorrorGame(builder);
        Boardgame boardgame = builder.getItem();
        System.out.println(boardgame.getBoard());

        BoardgameInstructionBuilder builderInstruction = new BoardgameInstructionBuilder();
        director.constructHorrorGame(builderInstruction);

        Instruction instruction = builderInstruction.getItem();
        System.out.println(instruction.getBoard());

        //----------------------

        BoardgameBuilder builder1 = new BoardgameBuilder();
        director.constructWarGame(builder1);
        Boardgame boardgame1 = builder1.getItem();
        System.out.println(boardgame1.getBoard());

        BoardgameInstructionBuilder builderInstruction1 = new BoardgameInstructionBuilder();
        director.constructWarGame(builderInstruction1);

        Instruction instruction1 = builderInstruction1.getItem();
        System.out.println(instruction1.getBoard());

    }
}