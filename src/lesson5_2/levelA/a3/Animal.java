package javaCore.src.lesson5_2.levelA.a3;

/*
Создайте класс Animal. Для класса Animal создайте 3-х уровневую иерархию наследования.
В классах наследниках реализуйте метод voice(). Создать класс Run  и в методе main создать по одному объекту
класса наследника и вызвать метод voice().
 */
public class Animal {
    void voice() {
        System.out.println("Царство животные\n");
    }

}

///подцарства : многоклеточные
class multicellular extends Animal {
    @Override
    void voice() {
        super.voice();
        System.out.println("Многоклеточные\n");
    }
}

//типы : хордовые
class chordates extends multicellular {
    @Override
    void voice() {
        super.voice();
        System.out.println("Хордовые\n");
    }
}

//под-тип позвоночные
class vertebrates extends chordates {
    @Override
    void voice() {
        super.voice();
        System.out.println("Позвоночные");
    }
}
