package practice.aggregation;

public class Department {
    private int departmentId;
    private String departmentName;
    private Teacher teacher;

    public Department(int departmentId, String departmentName ,Teacher teacher) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.teacher=teacher;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
