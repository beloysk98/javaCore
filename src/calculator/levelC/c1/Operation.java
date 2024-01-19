package javaCore.src.calculator.levelC.c1;

public interface Operation<T> {
    T add(T operation);//сума

    T subtract(T operation);//разность

    T multiply(T operation);//умножение

    T divide(T operation);//деление

}
