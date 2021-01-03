public class tester {

    public static void main(String[] args){

        double[][] matrix = {
                {1,0,4,11},{1,-1,4,6},{2,0,9,25}
        };

        double[][] matrix1 = {
                {1,-1,2,-3},{4,4,-2,1},{-2,2,-4,6}
        };

        double[][] matrix2 = {
                {-1,-2,3,-30},{-2,-3,-5,22},{1,5,5,-11}
        };

        double[][] matrix3 = {
                {3,9,-3,24},{1,-3,11,-2},{-2,5,-20,-5}
        };

        double[][] matrix4 = {
                {1,2,-3,7,4},{3,-1,-2,0,12},{-2,5,0,2,5},{2,3,-5,11,8}
        };
        Matrix m = new Matrix(matrix4);
        Echelon echelon = new Echelon();
        System.out.println(m);
        echelon.gaussianElimination(m);
        System.out.println(m);
    }
}
