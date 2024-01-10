package javaCore.src.calculator.levelC.c1;

public class Scalar extends Var {
    private double value;
    private String strScalar;
    private Scalar scalar;


    public Scalar(double value) {
        this.value = value;
    }

    public Scalar(Scalar scalar) {
        this.scalar = scalar;
    }

    public Scalar(String strScalar) {
        this.strScalar = strScalar;
    }

    @Override
    public String toString() {
        return "Scalar{}";
    }
}
