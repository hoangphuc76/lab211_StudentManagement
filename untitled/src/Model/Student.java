package Model;

import java.util.Objects;

public class Student {
    private String id, sName, semester, cName;

    public Student(String id, String sName, String semester, String cName) {
        this.id = id;
        this.sName = sName;
        this.semester = semester;
        this.cName = cName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Override
    public String toString() {
        return id + " | " + sName + " | " + semester;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(sName, student.sName) && Objects.equals(cName, student.cName);
    }
    public String reportFormat() {
        return String.format("%s | %s ", sName, cName);
    }
}
