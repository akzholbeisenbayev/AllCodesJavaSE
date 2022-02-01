package OOP.Chess;

//пешка
public class Pawn extends Piece {
    @Override
    public void isLegalMove(Position a, Position b) {
        if(a.getX()<2 || a.getX()>8 || (int) a.getY()<97 || (int)a.getY()>104 ||
                b.getX()<1 || b.getX()>8 || (int) b.getY()<97 || (int)b.getY()>104) System.out.println("Wrong Position!!!");
        else{
        if (a.getX() == 2) {
            if(Math.abs(a.getX() - b.getX()) <= 2 && a.getY() == b.getY())  System.out.println("The move can be made"); else System.out.println("The move CAN NOT be made");
        } else if(a.getX() - b.getX() == -1 && a.getY() == b.getY())  System.out.println("The move can be made"); else System.out.println("The move CAN NOT be made");
    }
    }
}