package javaCore.src.lesson6.levelA.a3;


public class Info {

    // на вход может быть передана строка в виде вектора и в виде: "{5, 2, 7}"
    void info(String str) {
        if (str.equals("1")) {
            System.out.println("скаляр");
        } else if (str.equals("{1, 2, 3}")) {
            System.out.println("вектор");
        } else {
            System.out.println("матрица");
        }
    }


}

