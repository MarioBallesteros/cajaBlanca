package es.ieslavereda.POO.ClasesChess.Controller;

import es.ieslavereda.POO.ClasesChess.model.Board;
import es.ieslavereda.POO.ClasesChess.model.PieceColor;

public class Game {
    private String whitePlayer;
    private String blackPlayer;
    private Board board;
    private PieceColor turno;

    public Game() {
        board = new Board();
        turno=PieceColor.WHITE;

    }

    public void start(){

    }
}
