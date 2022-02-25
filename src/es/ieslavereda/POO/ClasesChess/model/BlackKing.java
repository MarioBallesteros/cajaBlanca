package es.ieslavereda.POO.ClasesChess.model;

import java.io.Serializable;

import static es.ieslavereda.POO.ClasesChess.model.ChessType.BLACK_KING;

public class BlackKing extends King implements Serializable {
    public BlackKing(Cell cell){
        super(cell,BLACK_KING);
        place();
    }

}
