package aggregation;

public class Professor {
    private int professorId;
    private String professorName;
    private String subject;

    public Professor(int professorId, String professorName, String subject) {
        this.professorId = professorId;
        this.professorName = professorName;
        this.subject = subject;
    }

    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
