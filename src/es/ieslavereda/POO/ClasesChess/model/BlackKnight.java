package es.ieslavereda.POO.ClasesChess.model;

import java.io.Serializable;

import static es.ieslavereda.POO.ClasesChess.model.ChessType.BLACK_KNIGHT;
public class BlackKnight extends Knight implements Serializable {
    public BlackKnight(Cell cell){
        super(cell,BLACK_KNIGHT);
        place();
    }

}
