package pl.infoshare.academy.set3.company;

import java.util.ArrayList;
import java.util.List;

import pl.infoshare.academy.set3.company.address.Address;
import pl.infoshare.academy.set3.company.employee.CFOEmployee;
import pl.infoshare.academy.set3.company.employee.COOEmployee;
import pl.infoshare.academy.set3.company.employee.CTOEmployee;
import pl.infoshare.academy.set3.company.employee.Employee;
import pl.infoshare.academy.set3.outsourcing.RecruitmentAgency;
import pl.infoshare.academy.set3.outsourcing.recruitment.EmployeeCandidate;
import pl.infoshare.academy.set3.outsourcing.recruitment.ExperienceLevel;
import pl.infoshare.academy.set3.outsourcing.recruitment.Position;
import pl.infoshare.academy.set3.outsourcing.recruitment.VacancyRequirements;

/**
 * Created by Karol Lotkowski
 * Organization: infoShare Academy
 */
public class Company {

    private final RecruitmentAgency recruitmentAgency;

    private String name;
    private List<Employee> employees;
    private final Address address;

    public Company(String name, RecruitmentAgency recruitmentAgency) {
        this.recruitmentAgency = recruitmentAgency;

        this.name = name;
        this.employees = new ArrayList<>();
        this.address = new Address.AddressBuilder()
                .withStreet("Grunwaldzka")
                .withNumber(472)
                .withCity("Gdańsk")
                .build();
    }

    public void hireManagement() {
        final EmployeeCandidate ctoCandidate = recruitmentAgency.hireEmployee(new VacancyRequirements(Position.CTO, ExperienceLevel.MASTER));
        final EmployeeCandidate cfoCandidate = recruitmentAgency.hireEmployee(new VacancyRequirements(Position.CFO, ExperienceLevel.SENIOR));
        final EmployeeCandidate cooCandidate = recruitmentAgency.hireEmployee(new VacancyRequirements(Position.COO, ExperienceLevel.SENIOR));

        employees.add(verifyAndHire(ctoCandidate));
        employees.add(verifyAndHire(cfoCandidate));
        employees.add(verifyAndHire(cooCandidate));
    }

    public void listAllEmployees() {
        System.out.println("--- " + name + " employees ---");

        for (int i = 0; i < employees.size(); i++) {
            final int ordinal = i + 1;
            final Employee employee = employees.get(i);
            System.out.println(ordinal + ". " + employee.getRole() + ": " + employee.getFirstName() + " " + employee.getLastName());
        }
    }

    public void runBusiness() {
        employees.forEach(this::doWork);
    }

    private void doWork(final Employee employee) {
        employee.work();
    }

    private Employee verifyAndHire(final EmployeeCandidate candidate) {
        // sophisticated tests based on the candidate skills [candidate.getSkills()]
        switch (candidate.getPosition()) {
            case CTO:
                return new CTOEmployee(candidate.getFirstName(), candidate.getLastName(), candidate.getPosition().name());
            case CFO:
                return new CFOEmployee(candidate.getFirstName(), candidate.getLastName(), candidate.getPosition().name());
            case COO:
                return new COOEmployee(candidate.getFirstName(), candidate.getLastName(), candidate.getPosition().name());
            default:
                throw new PositionNotDefined("Cannot create employee without defined position");
        }
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Address getAddress() {
        return address;
    }

    private class PositionNotDefined extends IllegalStateException {

        PositionNotDefined(String msg) {
            super(msg);
        }
    }
}
