package cy.olesiabokk.universityapp.main;

import cy.olesiabokk.universityapp.entity.ProfessorImpl;
import cy.olesiabokk.universityapp.entity.StudentImpl;
import cy.olesiabokk.universityapp.entity.UniversityImpl;
import cy.olesiabokk.universityapp.entity.interfaces.Professor;
import cy.olesiabokk.universityapp.entity.interfaces.Student;
import cy.olesiabokk.universityapp.entity.interfaces.University;
import cy.olesiabokk.universityapp.service.UniversityLifeService;

public class Main {

    public static void main(String[] args) {
        University university = new UniversityImpl("Medical University of Vienna");
        Professor professor = new ProfessorImpl("Friedrich Baumann", "Medical", "Anesthesiology");
        Student student = new StudentImpl("Nicole Dupont", 19, "Medical", 2);
        UniversityLifeService service = new UniversityLifeService();

        service.showUniversityName(university);
        System.out.println("---------");
        service.showStudentAction(student, professor, university);
        System.out.println("---------");
        service.showProfessorAction(professor, student, university);
    }
}
