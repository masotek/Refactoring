package pl.infoshare.academy.set3.company.employee;

/**
 * Created by Karol Lotkowski
 * Organization: infoShare Academy
 */
public class COOEmployee extends Employee {

    public COOEmployee(final String firstName, final String lastName, final String role) {
        super(role, lastName, firstName);
    }

    @Override
    public void work() {
        System.out.println("Chief Operations Officer is working ...");
    }

}
