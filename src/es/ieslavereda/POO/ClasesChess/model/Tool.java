package es.ieslavereda.POO.ClasesChess.model;

import java.io.Serializable;
import java.util.List;

public class Tool implements Serializable {
    public static Coordinate[] add(Coordinate[] array, Coordinate coordinate){
        Coordinate[] aux = new Coordinate[array.length+1];

        for(int i=0;i< array.length;i++)
            aux[i]=array[i];

        aux[array.length]=coordinate;
        return aux;
    }
    public static void show(List<Coordinate> coordinates){
        for(Coordinate coordinate : coordinates)
            System.out.println(coordinate);
    }
}
