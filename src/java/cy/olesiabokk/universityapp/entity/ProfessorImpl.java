package cy.olesiabokk.universityapp.entity;

import cy.olesiabokk.universityapp.entity.interfaces.Professor;
import cy.olesiabokk.universityapp.entity.interfaces.Student;

public class ProfessorImpl implements Professor {
    private String name;
    private String faculty;
    private String courseName;
    private String studentName;
    private String universityName;

    @Override
    public String getName() {
        return name;
    }

    public ProfessorImpl(String name, String faculty, String courseName){
        this.name = name;
        this.faculty = faculty;
        this.courseName = courseName;
    }

    @Override
    public void prelect() {
        System.out.println(getName() + " works at the Medical faculty and teaches course " + courseName);
    }

    @Override
    public void doScientificWork() {
        System.out.println(getName() + " writes new scientific article.");
    }

    @Override
    public void giveExamination(Student student) {
        System.out.println("Today my student " + student.getName() + " is passing exam.");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " is walking after the working day.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats a salad.");
    }

    @Override
    public void gotoUniversity() {
        System.out.println("It takes" + getName() + " 10 minutes of walk to get to the University.");
    }
}
