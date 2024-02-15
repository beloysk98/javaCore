package javaCore.src.lesson9.levelB.b1;


import java.util.List;

public class University {
    private String nameUn;
    private List<Faculty> faculties;

    public University() {

    }

    public University(String nameUn, List<Faculty> faculties) {
        this.nameUn = nameUn;
        this.faculties = faculties;
    }

    public String getNameUn() {
        return nameUn;
    }

    public void setNameUn(String nameUn) {
        this.nameUn = nameUn;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    @Override
    public String toString() {
        return "Название университета: " + nameUn +
                ", список факультета : " + faculties;
    }
}
