package es.ieslavereda.POO.ClasesChess;
import es.ieslavereda.POO.ClasesChess.model.*;
import es.ieslavereda.POO.ClasesChess.view.Screen;
import static com.diogonunes.jcolor.Ansi.*;

public class App {
    static Board board = new Board();
    public static void main(String[] args) {


        Screen.show(board);
         Tool.show(board.getCellAt(new Coordinate('E',5)).getPiece().getNextMovements());

        System.out.println(RemainingPieces(board));
    }

    public static String RemainingPieces(Board board){
    String out = "";
        System.out.println("\n"+"        REMAINING  PIECES");
    for (ChessType chessType : ChessType.values()){
        out += colorize(" "+chessType.getShape()+" ",Cell.CellColor.BLACK_CELL.getAttribute(),chessType.getColor().getAttribute());
    }
    out += "\n";
    for (ChessType chessType : ChessType.values()){
            out+= colorize(" "+pieceGetter(board,chessType)+" ",Cell.CellColor.WHITE_CELL.getAttribute(),chessType.getColor().getAttribute());
    }
    return out;

    }

    public static long pieceGetter(Board board, ChessType chessType) {
        return  board.getCells().stream()
                .filter(c -> c.getPiece() != null)
                .map(c -> c.getPiece())
                .filter(piece -> piece.getChessType() ==chessType)
                .count();
    }

}
