package es.ieslavereda.POO.ClasesChess.model;

import java.io.Serializable;

import static es.ieslavereda.POO.ClasesChess.model.ChessType.WHITE_BISHOP;

public class WhiteBishop extends Bishop implements Serializable {
    public WhiteBishop(Cell cell){
        super(cell,WHITE_BISHOP);
        place();
    }

}
