package es.ieslavereda.POO.ClasesChess.model;

import java.io.Serializable;
import java.util.List;

public class BlackPawn extends Pawn implements Serializable {
    public BlackPawn(Cell cell) {
        super(cell, ChessType.BLACK_PAWN);
        place();
    }


}
