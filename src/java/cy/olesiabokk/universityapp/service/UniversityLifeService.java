package cy.olesiabokk.universityapp.service;

import cy.olesiabokk.universityapp.entity.UniversityImpl;
import cy.olesiabokk.universityapp.entity.interfaces.Professor;
import cy.olesiabokk.universityapp.entity.interfaces.Student;

public class UniversityLifeService {
    public void showUniversityInfo(UniversityImpl university) {
        System.out.println("University name: " + university.getUniversityName());
    }

    public void showStudentAction(Student student) {
        System.out.println("Student name: " + student.getName());
        student.gotoUniversity();
        student.eat();
        student.performTask();
        student.passExam();
    }

    public void showProfessorAction(Professor professor, Student student) {
        System.out.println("Professor name: " + professor.getName());
        professor.doScientificWork();
        professor.prelect();
        professor.giveExamination(student);
        professor.walk();
    }
}
