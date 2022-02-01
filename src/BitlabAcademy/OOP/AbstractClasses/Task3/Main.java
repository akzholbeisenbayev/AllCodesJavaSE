package BitlabAcademy.OOP.AbstractClasses.Task3;

public class Main
{
    public static void main(String[] args) {
        FerrariEngine ferrari1 = new FerrariEngine(4.0, 3, 100.0 );
        FerrariEngine ferrari2 = new FerrariEngine(3.8, 4, 150.0 );
        FerrariEngine ferrari3 = new FerrariEngine(3.0, 3, 100.50 );
        FerrariEngine ferrari4 = new FerrariEngine(4.5, 5, 170.38 );
        FerrariEngine ferrari5 = new FerrariEngine(3.5, 7, 100.56 );

        RenaultEngine renault1 = new RenaultEngine(6.2, 5, 551.51, 2.0);
        RenaultEngine renault5 = new RenaultEngine(4.6, 7, 55.45, 2.2);
        RenaultEngine renault2 = new RenaultEngine(5.2, 6, 158.48, 3.4);
        RenaultEngine renault3 = new RenaultEngine(6.8, 8, 53.54, 4.5);
        RenaultEngine renault4 = new RenaultEngine(1.3, 2, 63.25, 3.8);

        Engine engine[]={ferrari1, ferrari2, ferrari3, ferrari4, ferrari5, renault1, renault2, renault3, renault4, renault5};

        for (int i=0; i<engine.length;i++){
            System.out.println("Engine "  + (i+1) + ": " + engine[i].getMaxSpeed());
        }
    }
}
