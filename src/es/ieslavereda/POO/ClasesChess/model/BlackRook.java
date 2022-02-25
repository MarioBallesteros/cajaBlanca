package es.ieslavereda.POO.ClasesChess.model;

import java.io.Serializable;

import static es.ieslavereda.POO.ClasesChess.model.ChessType.BLACK_ROOK;

public class BlackRook extends Rook implements Serializable {
    public BlackRook(Cell cell){
        super(cell,BLACK_ROOK);
        place();
    }

}
