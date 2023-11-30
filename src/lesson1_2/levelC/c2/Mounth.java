package javaCore.src.lesson1_2.levelC.c2;

/*
Создайте метод, который на вход принимает значение месяца, а на выходе отдаёт пору года.
 */
public enum Mounth {
    DECEMBER, JANUARY, FEBRUARY, MARCH, APRIL, MAY,
    JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER;

    public static Season getSeason(Mounth myEnum) {
        Season season = Season.AUTUMN;
        switch (myEnum) {
            case DECEMBER, JANUARY, FEBRUARY:
                season = Season.WINTER;
                break;
            case MARCH, APRIL, MAY:
                season = Season.AUTUMN;
                break;
            case JUNE, JULY, AUGUST:
                season = Season.SUMMER;
                break;
            case SEPTEMBER, OCTOBER, NOVEMBER:
                season = Season.SPRING;
                break;
        }
        return season;
    }
}




