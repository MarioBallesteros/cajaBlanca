package es.ieslavereda.POO.ClasesChess.model;

import java.io.Serializable;

import static es.ieslavereda.POO.ClasesChess.model.ChessType.BLACK_QUEEN;

public class BlackQueen extends Queen implements Serializable {
    public BlackQueen(Cell cell){
        super(cell,BLACK_QUEEN);
        place();
    }

}
