package cy.olesiabokk.universityapp.main;

import cy.olesiabokk.universityapp.entity.ProfessorImpl;
import cy.olesiabokk.universityapp.entity.StudentImpl;
import cy.olesiabokk.universityapp.entity.UniversityImpl;
import cy.olesiabokk.universityapp.service.UniversityLifeService;

public class Main {
    public static void main(String[] args) {
        UniversityImpl university = new UniversityImpl("Medical University of Vienna");
        ProfessorImpl professor = new ProfessorImpl("Friedrich Baumann", "Medical", "Anesthesiology");
        StudentImpl student = new StudentImpl("Nicole Dupont", 19, "Medical", 2);
        UniversityLifeService service = new UniversityLifeService();

        service.showUniversityInfo(university);
        service.showStudentAction(student);
        service.showProfessorAction(professor, student);
    }
}
