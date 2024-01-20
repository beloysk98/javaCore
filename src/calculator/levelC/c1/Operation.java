package javaCore.src.calculator.levelC.c1;

public interface Operation<T> {
    void add(T firstObject, T secondObject);//сума

    void subtract(T firstObject, T secondObject);//разность

    void multiply(T firstObject, T secondObject);//умножение

    void divide(T firstObject, T secondObject);//деление

}
