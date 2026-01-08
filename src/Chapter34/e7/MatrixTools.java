package Chapter34.e7;

import java.util.Arrays;

public class MatrixTools {

    public static void main(String[] args){
        System.out.println(buildHistory(new String[]{"Error", "Info"}));
    }


    public static int[][] rotateMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] newMatrix = new int[cols][rows];

        for (int r = 0; r<rows; r++) {
            for (int c = 0; c<cols; c++) {
                newMatrix[c][rows-1-r] = matrix[r][c];
            }
        }
        return newMatrix;
    }

    public static String buildHistory(String[] logs){
        StringBuilder historyString = new StringBuilder(50);

        for(String log : logs) {
            historyString.append(log).append("->");
        }
        int errorIndex = historyString.indexOf("Error");
        historyString.replace(errorIndex,errorIndex+5,"CRITICAL");

        historyString.setLength(historyString.length()-2);

        return historyString.toString();
    }

}
