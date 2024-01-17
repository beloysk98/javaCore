package javaCore.src.calculator.levelC.c1;

public class Sa<T> {
    private String str;

    public void setStr(T str) {
        this.str = str.toString();
    }

    public static void main(String[] args) {
        Sa<Integer> inter = new Sa<>();
        inter.setStr(3);
        System.out.println(inter);
        Sa<Double> doub = new Sa<>();
        doub.setStr(4.0);
        System.out.println(doub);
    }

    @Override
    public String toString() {
        return str;
    }
}
