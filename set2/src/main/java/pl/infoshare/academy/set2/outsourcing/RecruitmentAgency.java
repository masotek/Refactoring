package pl.infoshare.academy.set2.outsourcing;

import pl.infoshare.academy.set2.company.employee.Employee;
import pl.infoshare.academy.set2.outsourcing.recruitment.VacancyRequirements;

public class RecruitmentAgency {

    public RecruitmentAgency() {
    }

    public Employee hireEmployee(VacancyRequirements vacancyRequirements) {
        System.out.println("Recruiting employee based on requirements: " + vacancyRequirements);
        return new Employee(vacancyRequirements.getTitle().name(), vacancyRequirements.getExperienceLevel());
    }
}