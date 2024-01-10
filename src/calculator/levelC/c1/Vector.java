package javaCore.src.calculator.levelC.c1;

public class Vector extends Var {
    private double[] value;
    private String strVector;
    private Vector vector;


    public Vector(double[] value) {
        this.value = value;
    }

    public Vector(Vector vector) {
        this.vector = vector;
    }

    public Vector(String strVector) {
        this.strVector = strVector;
    }

    @Override
    public String toString() {
        return "Vector{}";
    }
}
