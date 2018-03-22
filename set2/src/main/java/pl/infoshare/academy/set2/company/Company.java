package pl.infoshare.academy.set2.company;

import java.util.ArrayList;
import java.util.List;

import pl.infoshare.academy.set2.company.address.Address;
import pl.infoshare.academy.set2.company.employee.Employee;
import pl.infoshare.academy.set2.company.employee.ExperienceLevel;
import pl.infoshare.academy.set2.outsourcing.RecruitmentAgency;
import pl.infoshare.academy.set2.outsourcing.recruitment.VacancyRequirements;

import static pl.infoshare.academy.set2.outsourcing.recruitment.Position.CFO;
import static pl.infoshare.academy.set2.outsourcing.recruitment.Position.COO;
import static pl.infoshare.academy.set2.outsourcing.recruitment.Position.CTO;

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
        this.employees = new ArrayList<Employee>();
        this.address = new Address.AddressBuilder()
                .withStreet("Grunwaldzka")
                .withNumber(472)
                .withCity("Gdańsk")
                .build();
    }

    public void hireManagement() {
        employees.add(recruitmentAgency.hireEmployee(new VacancyRequirements(CTO, ExperienceLevel.MASTER)));
        employees.add(recruitmentAgency.hireEmployee(new VacancyRequirements(CFO, ExperienceLevel.SENIOR)));
        employees.add(recruitmentAgency.hireEmployee(new VacancyRequirements(COO, ExperienceLevel.SENIOR)));
    }

    public void listAllEmployees() {
        System.out.println("--- " + name + " employees ---");

        for (int i = 0; i < employees.size(); i++) {
            final int ordinal = i + 1;
            final Employee employee = employees.get(i);
            System.out.println(ordinal + ". " + employee.getTitle() + " [exp: " + employee.getExperienceLevel() + "]");
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

}
