public class tester {

    public static void main(String[] args){

        double[][] matrix = {
                {3,-2,1,2},
                {-1,-5,4,1},
                {1,4,-6,-9}
        };

        Matrix matrix1 = new Matrix(matrix);
        Echelon echelon = new Echelon();
        System.out.println(matrix1);
        echelon.gaussianElimination(matrix1);
        System.out.println(matrix1);
    }

}
