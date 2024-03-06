package cy.olesiabokk.universityapp.service;

import cy.olesiabokk.universityapp.entity.interfaces.Professor;
import cy.olesiabokk.universityapp.entity.interfaces.Student;
import cy.olesiabokk.universityapp.entity.interfaces.University;

public class UniversityLifeService {
    public void showUniversityName(University university) {
        System.out.println("University name: " + university.getName());
    }

    public void showStudentAction(Student student, Professor professor, University university) {
        System.out.println("Student name: " + student.getName());
        student.setUniversity(university);
        student.setProfessor(professor);
        student.gotoUniversity();
        student.learn();
        student.eat();
        student.performTask();
        student.passExam();
        student.walk();
    }

    public void showProfessorAction(Professor professor, Student student, University university) {
        System.out.println("Professor name: " + professor.getName());
        professor.setUniversity(university);
        professor.setStudent(student);
        professor.gotoUniversity();
        professor.doScientificWork();
        professor.prelect();
        professor.giveExamination();
        professor.eat();
        professor.walk();
    }
}
