package es.ieslavereda.POO.ClasesChess.model;

import java.io.Serializable;

import static com.diogonunes.jcolor.Ansi.colorize;

public class Coordinate implements Comparable<Coordinate>, Serializable {

    private char letter;
    private int number;

    public Coordinate(char letter, int number){
        String letterAsString = String.valueOf(letter);
        this.letter = (letterAsString.toUpperCase()).charAt(0);
        this.number = number;
    }

    public char getLetter() {
        return letter;
    }
    public int getNumber() {
        return number;
    }
    public int getLetterAsPosition() {
        return letter - 'A';
    }

    public int getNumberAsPosition() {
        return number - 1;
    }
    public Coordinate arribaCoord(){
        Coordinate C2=new Coordinate(letter,number-1);
        return C2;
    }
    public Coordinate abajoCoord(){
        Coordinate C2=new Coordinate(letter,number+1);
        return C2;
    }
    public Coordinate izquierdaCoord(){
        Coordinate C2=new Coordinate((char) (letter-1),number);
        return C2;
    }
    public Coordinate derechaCoord(){
        Coordinate C2=new Coordinate((char) (letter+1),number);
        return C2;
    }
    public Coordinate arribaIzquierdaCoord(){
        return arribaCoord().izquierdaCoord();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Coordinate))	return false;
        return ((Coordinate) o).getLetter() == this.letter &&
                ((Coordinate) o).getNumber() == this.number;
    }
    @Override
    public int compareTo(Coordinate c){
        if (c.getLetter() != this.letter) return c.getLetter() - this.letter;
        return (c.getNumber() != this.number) ? c.getNumber() - this.number: 0;
    }
    //Attribute[] myForm = new Attribute []{Attribute.TEXT_COLOR(15,35,202),Attribute.}
    @Override
    public int hashCode() {
        return number;
    }
    @Override
    public String toString(){
        return "("+letter+","+number+")";
    }
}
