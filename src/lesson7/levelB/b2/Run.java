package javaCore.src.lesson7.levelB.b2;

public class Run {
    public static void main(String[] args) {
        Circus ad = new Circus("Цирк1");
        Circus ab = new Circus("Цирк2");
        Bear bear = new Bear() {
            @Override
            void iCan() {
                System.out.println("Я умею петь");
            }

        };
        Horse horse = new Horse() {
            void d() {
                System.out.println("adad");
            }
        };
        ab.setHorse(horse);
        ad.setBear(bear);
        System.out.println(ad);
        System.out.println("ab" + ab);
        ad.poster();
    }
}
