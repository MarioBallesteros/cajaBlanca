package es.ieslavereda.POO.ClasesChess.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class Bishop extends Piece implements Serializable {
    public static boolean reintentar = true;
    public Bishop(Cell cell, ChessType chessType){
        super(cell,chessType);
    }
    public List<Coordinate> getNextMovements() {

        List<Coordinate> nextMovements = new ArrayList<>();
        Coordinate position = cell.getCoordinate();
        Coordinate aux;

        //Arriba Izquierda
        do {
            aux = position.arribaCoord();
            if (canMoveTo(aux) && !reintentar)
                nextMovements.add(aux);
        }while (canMoveTo(aux));

        //Arriba Derecha
        aux = position.abajoCoord();
        while (canMoveTo(aux)) {
            aux = position.abajoCoord();
            if (canMoveTo(aux) && !reintentar){
                nextMovements.add(aux);
                break;
            }
            nextMovements.add(aux);
        }

        // Abajo Izquierda
        aux = position.izquierdaCoord();
        while (canMoveTo(aux)) {
            aux = position.izquierdaCoord();
            if (canMoveTo(aux) && !reintentar){
                nextMovements.add(aux);
                break;
            }
            nextMovements.add(aux);
        }
        // Abajo Derecha
        aux = position.derechaCoord();
        while (canMoveTo(aux)) {
            aux = position.derechaCoord();
            if (canMoveTo(aux) && !reintentar){
                nextMovements.add(aux);
                break;
            }
            nextMovements.add(aux);
        }


        return nextMovements;
    }

}
