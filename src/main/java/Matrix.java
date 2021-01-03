public class Matrix {
    double[][] matrix;

    public Matrix(double[][] matrix){
        this.matrix = matrix;
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public double get(int row, int column){
        return matrix[column][row];
    }

    public String toString(){
        String out = "";
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                out += (matrix[i][j]);
                out += (" ");
            }
            out += "\n";

        }
        return out;
    }
}
