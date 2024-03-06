package cy.olesiabokk.universityapp.entity;

import cy.olesiabokk.universityapp.entity.interfaces.Professor;
import cy.olesiabokk.universityapp.entity.interfaces.Student;
import cy.olesiabokk.universityapp.entity.interfaces.University;

public class ProfessorImpl implements Professor, University {
    private String name;
    private String faculty;
    private String courseName;
    private Student student;
    private University university;

    @Override
    public String getName() {
        return name;
    }

    public ProfessorImpl(String name, String faculty, String courseName) {
        this.name = name;
        this.faculty = faculty;
        this.courseName = courseName;
    }

    @Override
    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public void setUniversity(University university) {
        this.university = university;
    }

    @Override
    public void prelect() {
        System.out.println("Professor " + getName() + " works at the Medical faculty in the " + university.getName() +
                " and teaches course " + courseName + " for the student " + student.getName());
    }

    @Override
    public void doScientificWork() {
        System.out.println("Professor " + getName() + " writes new scientific article.");
    }

    @Override
    public void giveExamination() {
        System.out.println("Today my student " + student.getName() + " is passing exam.");
    }

    @Override
    public void walk() {
        System.out.println("Professor " + getName() + " is walking after the working day.");
    }

    @Override
    public void eat() {
        System.out.println("Professor " + getName() + " eats a salad.");
    }

    @Override
    public void gotoUniversity() {
        System.out.println("It takes Professor " + getName() + " 10 minutes of walk to get to the " + university.getName());
    }
}
