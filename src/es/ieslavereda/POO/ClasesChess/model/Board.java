package es.ieslavereda.POO.ClasesChess.model;

import es.ieslavereda.POO.ClasesChess.IDeletedPieceManager;
import es.ieslavereda.POO.ClasesChess.dynamicStructure.MyList;

import java.io.Serializable;
import java.util.*;

public class Board implements Serializable {
    private Map<Coordinate, Cell> cells;
    private IDeletedPieceManager store;
    private List<Piece> whitePieces;
    private List<Piece> blackPieces;

    public Board() {
        cells = new HashMap<>();
        store = new MyList();
        whitePieces = new LinkedList<>();
        blackPieces = new LinkedList<>();

        Coordinate coordinate;
        Cell cell;
        for (int row = 1; row <= 8; row++) {
            for (int col = 0; col < 8; col++) {
                coordinate = new Coordinate(((char) ('A' + col)), row);
                cell = new Cell(this, coordinate);
                cells.put(coordinate, cell);
            }
        }

        placePieces();
    }

    private void placePieces() {

        // PEONES
        for (char i = 65; i<73; i++) {
            blackPieces.add(new BlackPawn(getCellAt(new Coordinate(i,2))));
            whitePieces.add(new WhitePawn(getCellAt(new Coordinate(i,7))));
        }

        // CABALLOS
        blackPieces.add(new BlackKnight(getCellAt(new Coordinate('B',1))));
        blackPieces.add(new BlackKnight(getCellAt(new Coordinate('G',1))));
        whitePieces.add(new WhiteKnight(getCellAt(new Coordinate('B',8))));
        whitePieces.add(new WhiteKnight(getCellAt(new Coordinate('G',8))));

        // TORRES
        blackPieces.add(new BlackRook((getCellAt(new Coordinate('A',1)))));
        blackPieces.add(new BlackRook(getCellAt(new Coordinate('H',1))));
        whitePieces.add(new WhiteRook(getCellAt(new Coordinate('H',8))));
        whitePieces.add(new WhiteRook(getCellAt(new Coordinate('A',8))));

          // ALFILES
        blackPieces.add(new BlackBishop(getCellAt(new Coordinate('C',1))));
        blackPieces.add(new BlackBishop(getCellAt(new Coordinate('F',1))));
        whitePieces.add(new WhiteBishop(getCellAt(new Coordinate('C',8))));
        whitePieces.add(new WhiteBishop(getCellAt(new Coordinate('F',8))));

          // REINAS
        blackPieces.add(new BlackQueen(getCellAt(new Coordinate('D',1))));
        whitePieces.add(new WhiteQueen(getCellAt(new Coordinate('D',8))));

          // REYES
        blackPieces.add(new BlackKing(getCellAt(new Coordinate('E',1))));
        whitePieces.add(new WhiteKing(getCellAt(new Coordinate('E',8))));

        // PRUEBAS
        blackPieces.add(new BlackBishop(getCellAt(new Coordinate('E',5))));
    }

    public IDeletedPieceManager getStore() {
        return null;
        //////////////////////////////////////////
    }


    public boolean containsCellAt(Coordinate coordinate) {
//        if (coordinate.getLetter()<'A' || coordinate.getLetter()>'H')
//            return false;
//        if (coordinate.getNumber()<1 || coordinate.getNumber()>8)
//            return false;
        return cells.containsKey(coordinate);
    }

    public boolean containsPieceAt(Coordinate coordinate) {
        Cell cell = getCellAt(coordinate);
        if (cell == null) return false;
        return (cell.getPiece() != null);
    }

    public Cell getCellAt(Coordinate coordinate) {
        return cells.get(coordinate);
    }

    public void hightLight(Coordinate[] coordinates){
        for(Coordinate coordinate : coordinates)
            getCellAt(coordinate).hightLight();
    }

    public void resetColors(){
            for(Cell cell : cells.values())
                cell.resetColor();
    }

    public Collection <Cell> getCells() {
        return cells.values();
    }

    public List <Piece> getWhitePieces(){
        List<Piece> pieces = new ArrayList<>();
        for (Cell cell : cells.values())
            if (cell.getPiece()!=null && cell.getPiece().getColor()==PieceColor.WHITE){
                pieces.add(cell.getPiece());
            }
        return pieces;
    }

    public List <Piece> getBlackPieces(){
        List<Piece> pieces = new ArrayList<>();
        for (Cell cell : cells.values())
            if (cell.getPiece()!=null && cell.getPiece().getColor()==PieceColor.BLACK){
                pieces.add(cell.getPiece());
            }
        return pieces;
    }
}