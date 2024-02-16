package javaCore.src.lesson9.levelB.b1;


import java.util.List;

public class University {
    private String nameUniversity;
    private List<Faculty> faculties;

    public University() {

    }

    public University(String nameUniversity, List<Faculty> faculties) {
        this.nameUniversity = nameUniversity;
        this.faculties = faculties;
    }

    public String getNameUniversity() {
        return nameUniversity;
    }

    public void setNameUniversity(String nameUniversity) {
        this.nameUniversity = nameUniversity;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    @Override
    public String toString() {
        return "Название университета: " + nameUniversity +
                ", список факультета : " + faculties;
    }
}
