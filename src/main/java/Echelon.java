import java.util.ArrayList;
import java.util.List;

public class Echelon {

    public void gaussianElimination(Matrix m){
        RowOperations rowOperations = new RowOperations();
        double[][] matrix = m.getMatrix();
        List<String> operations = new ArrayList<>();

        for(int i = 0; i < matrix.length; i++){

            double pivot = matrix[i][i];
            int temp = i;

            //TODO Need to verify this works.
            //If row i column i is a 0, swap out for a row below.
            String step = "";
            if(i == matrix.length - 1 && pivot == 0) {
                return;
            }else{}
            while (pivot == 0) {
                step = "R" + i + " <--> R" + (i + 1);
                rowOperations.switching(m, temp, (i + 1));
                //System.out.println("Pivot: "+pivot);
                pivot = m.getMatrix()[temp][temp];
                i++;
            }

            if (step.equals("")) {

            } else {
                operations.add(step);
            }
            i = temp;

            //Get row i and column i to 1
            operations.add(1 / pivot + "(R" + i + ") -> R" + i);
            rowOperations.scaling(m, i, 1 / pivot);

            //Get all other row's column i to 0
            //j is row i is column
            for (int j = 0; j < matrix.length; j++) {
                //Make sure you don't make row i(j in this case) column i a zero
                if (j == i) {
                } else {
                    operations.add((-1 * matrix[j][i]) + "(R" + i + ") + R" + j + " -> R" + j);
                    rowOperations.addingScaled(m, i, j, (-1 * matrix[j][i]));
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

        for(String s : operations){
            System.out.println(s);
        }

    }

}
