package cy.olesiabokk.universityapp.entity;

import cy.olesiabokk.universityapp.entity.interfaces.University;

public class UniversityImpl implements University {
    private String name;

    public UniversityImpl(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
