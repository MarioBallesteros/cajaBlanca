package cajaBlanca;

public class countEven {
    public static void main(String[] args) {
        String[][] matrix = { { "1", "3", "0" }, { "5", "3", "5" }, { "4", "2", "6" }, { "8", "7", "4" } };
        int[][] positions;

        show(matrix);
        System.out.println("hay pares: "+countOddElements(matrix));

    }

    private static int countOddElements(String[][] matrix) {
        int count=0;

        for (int row=0;row< matrix.length;row++){
            for (int col=0;col< matrix[0].length;col++){
                if (Integer.parseInt(matrix[row][col]) % 2 == 0)
                    count++;
            }
        }
        return count;
    }

    private static void show(String[][] matrix) {
        for (int row=0;row<matrix.length;row++){
            for (int col=0;col< matrix[0].length;col++){
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }

}
