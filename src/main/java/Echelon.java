public class Echelon {

    public void gaussianElimination(Matrix m){
        RowOperations rowOperations = new RowOperations();
        double[][] matrix = m.getMatrix();

        for(int i = 0; i < matrix.length; i++){

            double pivot = matrix[i][i];
            int temp = i;

            //TODO Need to verify this works.
            //If row i column i is a 0, swap out for a row below.
            while (pivot == 0){
                rowOperations.switching(m,i,i++);
                pivot = m.getMatrix()[i][i];
            }
            i = temp;

            //Get row i and column i to 1
            rowOperations.scaling(m,i,1/pivot);

            //Get all other row's column i to 0
            //j is row i is column
            for(int j = 0; j < matrix.length; j++){
                //Make sure you don't make row i(j in this case) column i a zero
                if(j == i){
                }else {
                    rowOperations.addingScaled(m,i,j,(-1*matrix[j][i]));
                }
            }
        }

        //Set any -0 to 0
        for(int i = 0; i < m.matrix.length; i++) {
            for(int j = 0; j < m.matrix.length; j++) {
                if (m.matrix[j][i] == -0) {
                    m.matrix[j][i] = 0;
                }
            }
        }
    }

}
