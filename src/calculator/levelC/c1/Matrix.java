package javaCore.src.calculator.levelC.c1;

public class Matrix extends Var {
    private double[][] value;
    private String strMatrix;
    private Matrix matrix;


    public Matrix(double[][] value) {
        this.value = value;
    }

    public Matrix(Matrix matrix) {
        this.matrix = matrix;
    }

    public Matrix(String strMatrix) {
        this.strMatrix = strMatrix;
    }

    @Override
    public String toString() {
        return "Matrix{}";
    }
}
