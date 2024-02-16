package javaCore.src.lesson9.levelB.b1;

import java.util.List;

/*
Создайте класс Faculty который будет хранить в себе название
    факультета и список групп этого факультета
 */
public class Faculty {
    private String nameFaculty;
    private List<Group> groups;

    public Faculty(String nameFaculty, List<Group> groups) {
        this.nameFaculty = nameFaculty;
        this.groups = groups;
    }

    public String getNameFaculty() {
        return nameFaculty;
    }

    public void setNameFaculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return nameFaculty +
                ", группа = " + groups;
    }
}
