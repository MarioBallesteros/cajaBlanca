package es.ieslavereda.POO.ClasesChess.model;

import java.io.Serializable;

import static es.ieslavereda.POO.ClasesChess.model.ChessType.WHITE_KNIGHT;

public class WhiteKnight extends Knight implements Serializable {
    public WhiteKnight(Cell cell){
        super(cell,WHITE_KNIGHT);
        place();
    }

}
