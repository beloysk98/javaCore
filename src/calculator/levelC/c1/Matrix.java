package javaCore.src.calculator.levelC.c1;

public class Matrix extends Var {
    private double[][] value;

    public Matrix(double[][] value) {
        this.value = value;
    }

    public Matrix(Matrix matrix) {
        this.value = matrix.value;
    }

    public Matrix(String strMatrix) {
        strMatrix = strMatrix.replaceAll("[{}]", "");
        String[] strSplit = strMatrix.split(",");
        double[] doubleArray = new double[strSplit.length];
        for (int i = 0; i < strSplit.length; i++) {
            doubleArray[i] = Double.parseDouble(strSplit[i]);
        }
        double[][] doubles = new double[1][doubleArray.length];
        for (int j = 0; j < 1; j++) {
            for (int g = 0; g < doubleArray.length; g++) {
                doubles[j][g] = doubleArray[g];
            }
        }
        //System.out.println("Вид двумерного масива: "+Arrays.deepToString(doubles));
        this.value = doubles;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
