package cy.olesiabokk.universityapp.entity.interfaces;

public interface Student extends General {
    void learn();

    void performTask();

    void passExam();

    void setProfessor(Professor professor);

}
