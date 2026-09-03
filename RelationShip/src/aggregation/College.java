package aggregation;

public class College {
    private String collegeName;
    private Professor professor;

    public College(String collegeName, Professor professor) {
        this.collegeName = collegeName;
        this.professor = professor;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
