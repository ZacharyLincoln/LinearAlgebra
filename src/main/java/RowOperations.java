public class RowOperations {

    //Switching
    public void switching(Matrix m, int row1, int row2){
        double[][] matrix = m.getMatrix();

        double[] temp = matrix[row1];
        matrix[row1] = matrix[row2];
        matrix[row2] = temp;

        m.matrix = matrix;
    }

    //Scaling
    public void scaling(Matrix m, int row, double amount){
        double[][] matrix = m.getMatrix();

        double[] newRow = new double[matrix[row].length];
        for(int i = 0; i < matrix[row].length; i++){
            newRow[i] =  ((double) matrix[row][i]) * amount;
        }
        matrix[row] = newRow;

        m.matrix = matrix;
    }

    //Adding
    public void adding(Matrix m, int row1, int row2, int toRow){

        double[][] matrix = m.getMatrix();

        double[] newRow = new double[matrix[row1].length];
        for(int i = 0; i < matrix[row1].length; i++){
            newRow[i] =  matrix[row1][i] + matrix[row2][i];
        }
        //return newRow;
        matrix[toRow] = newRow;

        m.matrix = matrix;
    }

    //Adding Scaled

    /**
     *
     * @param m
     * @param row1
     * @param row2  this is the row that will be modified
     * @param scale
     */
    public void addingScaled(Matrix m, int row1, int row2, double scale){
        double[][] matrix = m.matrix;
        double[] scaledRow = new double[matrix[row1].length];

        for(int i = 0; i < matrix[row1].length; i++){
            scaledRow[i] =  ((double) matrix[row1][i]) * scale;
        }

        double[] newRow = new double[matrix[row2].length];
        for(int i = 0; i < matrix[row1].length; i++){
            newRow[i] =  scaledRow[i] + matrix[row2][i];


        }
        matrix[row2] = newRow;
        m.matrix = matrix;
    }


}
