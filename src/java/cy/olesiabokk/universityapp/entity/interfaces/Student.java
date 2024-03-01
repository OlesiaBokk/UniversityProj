package cy.olesiabokk.universityapp.entity.interfaces;

import cy.olesiabokk.universityapp.entity.UniversityImpl;

public interface Student extends General {
    void learn(UniversityImpl university);

    void performTask();

    void passExam();
}
