package cy.olesiabokk.universityapp.entity.interfaces;

public interface Professor extends General {
    void prelect();

    void doScientificWork();

    void giveExamination(Student student);
}
