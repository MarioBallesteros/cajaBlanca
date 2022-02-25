package es.ieslavereda.POO.ClasesChess.model;

import com.diogonunes.jcolor.Attribute;

import java.io.Serializable;
import java.util.List;

import static com.diogonunes.jcolor.Ansi.colorize;

public abstract class Piece implements Serializable {
    private ChessType chessType;
    protected Cell cell;

    public Piece(Cell cell,ChessType chessType){
        this.cell=cell;
        this.chessType =chessType;
    }
    public void place(){
        cell.setPiece(this);
    }

    public PieceColor getColor(){
        return chessType.getColor();
    }

    public boolean moveTo(Coordinate c){
        if (cell == null || !cell.getBoard().containsCellAt(c))
            return false;

        //if (Tool.contains(getNextMovements(),c)){
            Board board = cell.getBoard();
            if (board.containsPieceAt(c)){
                // matamos pieza
                Piece piece = board.getCellAt(c).getPiece();
                piece.cell = null;
          //      board.getStore().add(piece);
            //}
                // solo te mueves a C
            cell = board.getCellAt(c);
            place();
            return true;
        }else
            return false;

    }

    public Cell getCell() {
        return cell;
    }

    public String toString(){
        Attribute background = cell.getColor().getAttribute();
        Attribute textColor = chessType.getColor().getAttribute();
        Attribute[] myFormat = new Attribute[]{background,textColor};

        return colorize(" " + chessType.getShape() + " ",myFormat);

    }
    @Override
    public boolean equals(Object o){
        if(o instanceof Piece){
            Piece p = (Piece) o;
            if(p.cell == this.cell && p.chessType == this.chessType)
                return true;
            else
                return false;
        } else
            return false;
    }

    public ChessType getChessType() {
        return chessType;
    }

    public abstract List<Coordinate> getNextMovements();

    public boolean canMoveTo(Coordinate coordinate){
        Board board = cell.getBoard();

        return (board.containsCellAt(coordinate) && !board.containsPieceAt(coordinate))
                || (board.containsCellAt(coordinate) && board.containsPieceAt(coordinate) &&
                board.getCellAt(coordinate).getPiece().getColor() !=getColor());
    }
}
