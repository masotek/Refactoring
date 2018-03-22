package pl.infoshare.academy.set3.company.employee;

/**
 * Created by Karol Lotkowski
 * Organization: infoShare Academy
 */
public class CTOEmployee extends Employee {


    public CTOEmployee(final String firstName, final String lastName, final String role) {
        super(role, lastName, firstName);
    }

    @Override
    public void work() {
        System.out.println("Chief Technology Officer is working ...");
    }
}
