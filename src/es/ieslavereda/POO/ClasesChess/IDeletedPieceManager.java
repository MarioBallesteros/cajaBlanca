package es.ieslavereda.POO.ClasesChess;

import es.ieslavereda.POO.ClasesChess.model.ChessType;
import es.ieslavereda.POO.ClasesChess.model.Piece;

public interface IDeletedPieceManager {
    void add(Piece piece);
    void remove(Piece piece);
    int count(ChessType chessType);


}
