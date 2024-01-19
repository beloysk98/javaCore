package javaCore.src.calculator.levelC.c1;

public class Scalar extends Var {

    private double value;
    public Scalar(double value) {
        this.value = value;
    }

    public Scalar(Scalar scalar) {
        this.value = scalar.value;
    }
    public Scalar(String strScalar) {
        String s = strScalar.replace(" ", "");
        String[] d = strScalar.split(",");
        this.value = Double.parseDouble(strScalar);
    }

    public String toString() {
        return String.valueOf(value);
    }
}
