package es.ieslavereda.POO.ClasesChess.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class Knight extends Piece implements Serializable {
    public Knight(Cell cell, ChessType chessType){
        super(cell,chessType);
    }
    @Override
    public List<Coordinate> getNextMovements() {

        List<Coordinate> nextMovements = new ArrayList<>();
        boolean reintentar = true;
        Coordinate position = cell.getCoordinate();
        Coordinate aux;
        //Arriba
        aux = position.arribaCoord().arribaCoord().izquierdaCoord();
        if(canMoveTo(aux))
            nextMovements.add(aux);

        aux = position.arribaCoord().arribaCoord().derechaCoord();
        if(canMoveTo(aux))
            nextMovements.add(aux);

        //Abajo
        aux = position.abajoCoord().abajoCoord().izquierdaCoord();
        if(canMoveTo(aux))
            nextMovements.add(aux);

        aux = position.abajoCoord().abajoCoord().derechaCoord();
        if(canMoveTo(aux))
            nextMovements.add(aux);

        //Izquierda
        aux = position.izquierdaCoord().izquierdaCoord().abajoCoord();
        if(canMoveTo(aux))
            nextMovements.add(aux);

        aux = position.izquierdaCoord().izquierdaCoord().arribaCoord();
        if(canMoveTo(aux))
            nextMovements.add(aux);

        //Derecha
        aux = position.derechaCoord().derechaCoord().abajoCoord();
        if(canMoveTo(aux))
            nextMovements.add(aux);

        aux = position.derechaCoord().derechaCoord().arribaCoord();
        if(canMoveTo(aux))
            nextMovements.add(aux);


        return nextMovements;
    }

}
