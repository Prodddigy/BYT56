public class Main {

    private static Memento backup;

    public static void main(String[] args)
    {
       // System.out.println("Hello world!");
      //  Minifigure minifigure = new Minifigure();



        Director director = new Director();

        MinifigureBuilder builder = new MinifigureBuilder();
        director.constructIndianaJones(builder);
        Minifigure minifigure = builder.getFigurine();
        System.out.println(minifigure.getHead());





        makeBackup(minifigure);
        minifigure.setHead("Shia Labeouf");

        System.out.println(backup.getMinifigure().getHead());
        undo();

        System.out.println(backup.getMinifigure().getHead());

    }//"harrison ford","brown jacket","brown pants","whip"

    public static void makeBackup(Minifigure minifigure)
    {
        backup = minifigure.saveMinifigure();
    }

    public static void undo()
    {
        if(backup != null)
        {
            backup.restore();
        }
    }
}