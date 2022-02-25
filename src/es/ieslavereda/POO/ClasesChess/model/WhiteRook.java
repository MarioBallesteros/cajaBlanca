package es.ieslavereda.POO.ClasesChess.model;

import java.io.Serializable;

import static es.ieslavereda.POO.ClasesChess.model.ChessType.WHITE_ROOK;

public class WhiteRook extends Rook implements Serializable {
    public WhiteRook(Cell cell){
        super(cell,WHITE_ROOK);
        place();
    }

}
