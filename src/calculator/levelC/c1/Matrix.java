package javaCore.src.calculator.levelC.c1;

public class Matrix extends Var {
    private double[][] value;
    private String strMatrix;
    private Matrix matrix;

// не выполнено условие задачи: Каждый конструктор должен сохранить переданное значение в переменнУЮ класса.
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
        // этот метод должен выводить содержимое этого класса, т е то, что хранит переменная.
        return "Matrix{}";
    }
}
