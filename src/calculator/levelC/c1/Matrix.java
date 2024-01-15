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
        this.value = new double[][]{{Double.parseDouble(strMatrix)}};
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
