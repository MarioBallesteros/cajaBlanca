package es.ieslavereda.POO.ClasesChess.model;

import java.io.Serializable;

import static es.ieslavereda.POO.ClasesChess.model.ChessType.BLACK_BISHOP;

public class BlackBishop extends Bishop implements Serializable {
    public BlackBishop(Cell cell){
        super(cell,BLACK_BISHOP);
        place();
    }

}
