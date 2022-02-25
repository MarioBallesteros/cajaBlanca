package es.ieslavereda.POO.ClasesChess.model;

import java.io.Serializable;

import static es.ieslavereda.POO.ClasesChess.model.ChessType.WHITE_KING;

public class WhiteKing extends King implements Serializable {
    public WhiteKing(Cell cell){
        super(cell,WHITE_KING);
        place();
    }

}
