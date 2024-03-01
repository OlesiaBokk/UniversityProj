package cy.olesiabokk.universityapp.entity;

import cy.olesiabokk.universityapp.entity.interfaces.Student;

public class StudentImpl implements Student {
    private String name;
    private int age;
    private int year;
    private String faculty;
    private String universityName;

    @Override
    public String getName() {
        return name;
    }

    public String getUniversityName(UniversityImpl university) {
        return universityName = university.getUniversityName();
    }

    public StudentImpl(String name, int age, String faculty, int year) {
        this.name = name;
        this.age = age;
        this.faculty = faculty;
        this.year = year;
    }

    @Override
    public void learn(UniversityImpl university) {
        System.out.println("I am " + getName() + " I'm a student at the faculty: " + faculty + " at the " + getUniversityName(university));
    }

    @Override
    public void performTask() {
        System.out.println(getName() + " prepared lecture and presentation.");
    }

    @Override
    public void passExam() {
        System.out.println(getName() + "'s going to pass exam.");
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
        System.out.println(getName() + " goes to University by bus.");
    }
}
