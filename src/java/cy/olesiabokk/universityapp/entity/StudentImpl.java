package cy.olesiabokk.universityapp.entity;

import cy.olesiabokk.universityapp.entity.interfaces.Professor;
import cy.olesiabokk.universityapp.entity.interfaces.Student;
import cy.olesiabokk.universityapp.entity.interfaces.University;

public class StudentImpl implements Student {
    private String name;
    private int age;
    private int year;
    private String faculty;
    private Professor professor;
    private University university;


    @Override
    public String getName() {
        return name;
    }

    public StudentImpl(String name, int age, String faculty, int year) {
        this.name = name;
        this.age = age;
        this.faculty = faculty;
        this.year = year;
    }

    @Override
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public void setUniversity(University university) {
        this.university = university;
    }

    @Override
    public void learn() {
        System.out.println("I am " + getName() + " I'm a student at the " + faculty + " faculty at the " +
                university.getName() + ". My professor is " + professor.getName());
    }

    @Override
    public void performTask() {
        System.out.println(getName() + " prepared lecture and presentation.");
    }

    @Override
    public void passExam() {
        System.out.println(getName() + "'s going to pass exam. Professor is " + professor.getName());
    }

    @Override
    public void walk() {
        System.out.println(getName() + " goes for a walk after studies.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats a chocolate donut.");
    }

    @Override
    public void gotoUniversity() {
        System.out.println(getName() + " goes to " + university.getName() + " by bus.");
    }
}
