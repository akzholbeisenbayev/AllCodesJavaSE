package OOP.Chess;

public class Main
{
    public static void main(String[] args)
    {

        System.out.print("King: ");
        Position positionKing1 = new Position('a', 11);
        Position positionKing2 = new Position ('b', 3);
        King k = new King();
        k.isLegalMove(positionKing1, positionKing2);

        System.out.print("Pawn: ");
        Position positionPeshka1 = new Position('a', 1);
        Position positionPeshka2 = new Position ('b', 3);
        Pawn p = new Pawn();
        p.isLegalMove(positionPeshka1, positionPeshka2);

        System.out.print("Horse: ");
        Position positionHorse1 = new Position('d', 2);
        Position positionHorse2 = new Position ('f', 3);
        Horse horse = new Horse();
        horse.isLegalMove(positionHorse1, positionHorse2);

        System.out.print("Elephant: ");
        Position positionElephant1 = new Position('d', 2);
        Position positionElephant2 = new Position ('f', 3);
        Elephant elephant = new Elephant();
        elephant.isLegalMove(positionElephant1, positionElephant2);

        System.out.print("Rook: ");
        Position positionRook1 = new Position('d', 2);
        Position positionRook2 = new Position('d', 7);
        Rook rook = new Rook();
        rook.isLegalMove(positionRook1, positionRook2);

        System.out.print("Queen: ");
        Position positionQueen1 = new Position('a', 2);
        Position positionQueen2 = new Position('a', 8);
        Queen queen = new Queen();
        queen.isLegalMove(positionQueen1, positionQueen2);

    }
}
