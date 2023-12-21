package javaCore.src.lesson5_2.levelA.a3;

/*
Создайте класс Animal. Для класса Animal создайте 3-х уровневую иерархию наследования.
В классах наследниках реализуйте метод voice(). Создать класс Run  и в методе main создать по одному объекту
класса наследника и вызвать метод voice().
 */
public class Animal {
    void voice() {
    }
}

class fish extends Animal {

}

class fishFamily extends fish {
}

class squads extends fishFamily {
}
