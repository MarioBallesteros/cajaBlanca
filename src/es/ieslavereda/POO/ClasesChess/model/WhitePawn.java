package es.ieslavereda.POO.ClasesChess.model;

import java.io.Serializable;
import java.util.List;

public class WhitePawn extends Pawn implements Serializable {
    public WhitePawn(Cell cell) {
        super(cell, ChessType.WHITE_PAWN);
        place();
    }

}
