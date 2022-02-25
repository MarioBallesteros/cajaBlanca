package es.ieslavereda.POO.ClasesChess.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class King extends Piece implements Serializable {
    public King(Cell cell, ChessType chessType){
        super(cell,chessType);
    }
    @Override
    public List<Coordinate> getNextMovements() {

        List<Coordinate> nextMovements = new ArrayList<>();

        Coordinate position = cell.getCoordinate();
        Coordinate aux;
        //Arriba
        aux = position.arribaCoord();
        if(canMoveTo(aux))
            nextMovements.add(aux);

        // Arriba Izquierda
        aux = position.arribaCoord().izquierdaCoord();
        if(canMoveTo(aux))
            nextMovements.add(aux);

        //Arriba Derecha
        aux = position.arribaCoord().derechaCoord();
        if(canMoveTo(aux))
            nextMovements.add(aux);

        //Izquierda
        aux = position.izquierdaCoord();
        if(canMoveTo(aux))
            nextMovements.add(aux);

       //Derecha
        aux = position.derechaCoord();
        if(canMoveTo(aux))
            nextMovements.add(aux);

        //Abajo
        aux = position.abajoCoord();
        if(canMoveTo(aux))
            nextMovements.add(aux);

        //Abajo Izquierda
        aux = position.abajoCoord().izquierdaCoord();
        if(canMoveTo(aux))
            nextMovements.add(aux);

        //Abajo Derecha
        aux = position.abajoCoord().derechaCoord();
        if(canMoveTo(aux))
            nextMovements.add(aux);


        return nextMovements;
    }

}
