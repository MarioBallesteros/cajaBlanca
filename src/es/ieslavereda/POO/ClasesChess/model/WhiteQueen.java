package es.ieslavereda.POO.ClasesChess.model;

import java.io.Serializable;

import static es.ieslavereda.POO.ClasesChess.model.ChessType.WHITE_QUEEN;

public class WhiteQueen extends Knight implements Serializable {
    public WhiteQueen(Cell cell){
        super(cell,WHITE_QUEEN);
        place();
    }

}
