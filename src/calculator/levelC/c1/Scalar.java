package javaCore.src.calculator.levelC.c1;

public class Scalar extends Var implements Operation<Double> {

    private double value;

    public Scalar() {
    }

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

    @Override
    public void add(Double firstObject, Double secondObject) {
        System.out.println(firstObject + secondObject);
    }

    @Override
    public void subtract(Double firstObject, Double secondObject) {
        System.out.println(firstObject - secondObject);
    }

    @Override
    public void multiply(Double firstObject, Double secondObject) {
        System.out.println(firstObject * secondObject);
    }

    @Override
    public void divide(Double firstObject, Double secondObject) {
        System.out.println(firstObject / secondObject);
    }
}
