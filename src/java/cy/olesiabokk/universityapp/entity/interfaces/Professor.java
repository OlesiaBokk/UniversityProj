package cy.olesiabokk.universityapp.entity.interfaces;

public interface Professor extends General {
    void prelect();

    void doScientificWork();

    void giveExamination();

    void setStudent(Student student);
}
