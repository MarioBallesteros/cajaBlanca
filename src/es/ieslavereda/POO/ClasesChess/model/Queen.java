package es.ieslavereda.POO.ClasesChess.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class Queen extends Piece implements Serializable {
    public static boolean reintentar = true;
    public Queen(Cell cell, ChessType chessType){
        super(cell,chessType);
    }
    @Override
    public List<Coordinate> getNextMovements() {
        return getNextQueenMovements(this);
    }

    public List<Coordinate> getNextQueenMovements(Piece piece) {

        List<Coordinate> nextMovements = new ArrayList<>();
        Coordinate position = piece.getCell().getCoordinate();
        Coordinate aux;

        //Arriba
        aux = position.arribaCoord();
        while (canMoveTo(aux,piece)) {
            aux = position.arribaCoord();
            if (canMoveTo(aux,piece) && !reintentar){
                nextMovements.add(aux);

                break;
            }
            nextMovements.add(aux);
        }
        //Abajo
        aux = position.abajoCoord();
        while (canMoveTo(aux,piece)) {
            aux = position.abajoCoord();
            if (canMoveTo(aux,piece) && !reintentar){
                nextMovements.add(aux);
                break;
            }
            nextMovements.add(aux);
        }

        // Izquierda
        aux = position.izquierdaCoord();
        while (canMoveTo(aux,piece)) {
            aux = position.izquierdaCoord();
            if (canMoveTo(aux,piece) && !reintentar){
                nextMovements.add(aux);
                break;
            }
            nextMovements.add(aux);
        }
        // Derecha
        aux = position.derechaCoord();
        while (canMoveTo(aux,piece)) {
            aux = position.derechaCoord();
            if (canMoveTo(aux,piece) && !reintentar){
                nextMovements.add(aux);
                break;
            }
            nextMovements.add(aux);
        }


        return nextMovements;
    }
    public boolean canMoveTo(Coordinate coordinate,Piece piece){
        Board board = piece.getCell().getBoard();

        return (board.containsCellAt(coordinate) && !board.containsPieceAt(coordinate))
                || (board.containsCellAt(coordinate) && board.containsPieceAt(coordinate) &&
                board.getCellAt(coordinate).getPiece().getColor() !=getColor());
    }

}
