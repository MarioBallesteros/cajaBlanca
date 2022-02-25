package es.ieslavereda.POO.ClasesChess.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class Pawn extends Piece implements Serializable {
    boolean firstMove = true;
    public Pawn(Cell cell, ChessType chessType){
        super(cell,chessType);
    }
    @Override
    public List<Coordinate> getNextMovements() {


        List<Coordinate> nextMovements = new ArrayList<>();

        Coordinate position = cell.getCoordinate();
        Coordinate aux;
        //Arriba Arriba
        aux = position.arribaCoord();
        if(canMoveTo(aux) && firstMove)
            nextMovements.add(aux);

        // Arriba
        aux = position.arribaCoord();
        if(canMoveTo(aux))
            nextMovements.add(aux);

        //Abajo Abajo
        aux = position.abajoCoord().abajoCoord();
        if(canMoveTo(aux) && firstMove)
            nextMovements.add(aux);

        //Abajo
        aux = position.abajoCoord();
        if(canMoveTo(aux))
            nextMovements.add(aux);


        return nextMovements;
    }

}

