package cajaBlanca;
import java.util.Scanner;
public class ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float height;

        String[][] heights = {
                {"Peter", "1.85"},
                {"John", "1.86"},
                {"Thomas", "1.78"},
                {"Carl", "1.62"},
                {"Lewis", "1.68"},
                {"Michael", "1.65"},
                {"Vanessa", "1.70"},
                {"Anne", "1.69"}
        };
        System.out.println("la altura a buscar");
        height = sc.nextFloat();
        bubble(heights);
        show(heights);
        System.out.println("busqueda iterativa = "+IterativeSearch(heights,height));
    }

    private static void show(String[][] heights) {
        for (int row=0;row< heights.length;row++){
            for (int col=0;col< heights[0].length;col++){
                System.out.println(heights[row][col]+" ");
            }
            System.out.println();
        }
    }

    private static void bubble(String[][] heights) {

        for (int i=1;i< heights.length;i++){
            for (int j=0;j< heights[0].length-1;j++){
                if (Float.parseFloat(heights[j][1]) > Float.parseFloat(heights[j+1][1]))
                    swap(heights,j,j+1);
            }
        }
    }

    private static void swap(String[][] arreglo, int j, int i) {
        String[] aux = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = aux;
    }

    private static String IterativeSearch(String[][] heights,Float height){
        int pos =0;
        while (pos < heights.length && Float.parseFloat(heights[pos][1]) < height)
            pos++;

        if (pos >= heights.length)
            return "The height "+height+" not found";
        else
            return heights[pos][0];

    }
}