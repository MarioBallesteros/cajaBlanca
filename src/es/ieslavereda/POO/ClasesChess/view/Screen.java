package es.ieslavereda.POO.ClasesChess.view;

import es.ieslavereda.POO.ClasesChess.model.Board;
import es.ieslavereda.POO.ClasesChess.model.Coordinate;

public class Screen {
    public static void show(Board board){
        String letras="       A  B  C  D  E  F  G  H";
        String salida="";
        int num=1;
        Coordinate c;
        System.out.println(letras);
        for (int row=0;row<8;row++){
            salida+="    "+(row + 1 )+" ";
            for (int col=0;col<8;col++){
                c = new Coordinate((char)('A'+col),row+1);
                salida+=board.getCellAt(c).toString();
            }
            salida+=" "+num +"\n";
            num++;
        }
        System.out.print(salida);
        System.out.println(letras);
    }
}
