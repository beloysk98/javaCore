package javaCore.src.lesson9.levelB.b1;

import java.util.List;

/*
Создайте класс Faculty который будет хранить в себе название
    факультета и список групп этого факультета
 */
public class Faculty {
    private String nameFacul;
    private List<Group> groups;

    public Faculty(String nameFacul, List<Group> groups) {
        this.nameFacul = nameFacul;
        this.groups = groups;
    }

    public String getNameFacul() {
        return nameFacul;
    }

    public void setNameFacul(String nameFacul) {
        this.nameFacul = nameFacul;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return nameFacul +
                ", группа = " + groups;
    }
}
