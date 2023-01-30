package co.develhope.hybernate.entities;

import javax.persistence.*;

@Entity
@Table(name = "enrollments")
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Student student;
    @ManyToOne
    private SchoolClass schoolClass;

    public Enrollment(){}
    public Enrollment(Long id, Student student, SchoolClass schoolClass) {
        this.id = id;
        this.student = student;
        this.schoolClass = schoolClass;
    }

    public Long getId() {
        return id;
    }

    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }

    public SchoolClass getSchoolClass() {
        return schoolClass;
    }
    public void setSchoolClass(SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
    }
}