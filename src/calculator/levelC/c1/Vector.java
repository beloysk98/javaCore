package javaCore.src.calculator.levelC.c1;

import java.util.Arrays;

public class Vector extends Var {
    private double[] value;

    public Vector(double[] value) {
        this.value = value;
    }

    public Vector(Vector vector) {
        this.value = new double[]{vector.value[0]};
    }

    public Vector(String strVector) {
        String[] firstSplit = strVector.split(",");
        for (int i = 0; i < firstSplit.length; i++) {
            this.value[i] = Double.parseDouble(firstSplit[i]);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(value);
    }
}