package pl.infoshare.academy.set3.outsourcing;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import pl.infoshare.academy.set3.outsourcing.recruitment.EmployeeCandidate;
import pl.infoshare.academy.set3.outsourcing.recruitment.Position;
import pl.infoshare.academy.set3.outsourcing.recruitment.Skill;
import pl.infoshare.academy.set3.outsourcing.recruitment.VacancyRequirements;

/**
 * Created by Karol Lotkowski
 * Organization: infoShare Academy
 */
public class RecruitmentAgency {

    private List<String> firstNames;
    private List<String> lastNames;

    public RecruitmentAgency() {
        this.firstNames = Arrays.asList("Elon", "Mark", "Jeff");
        this.lastNames = Arrays.asList("Musk", "Zuckerberg", "Bezos");

    }

    public EmployeeCandidate hireEmployee(VacancyRequirements vacancyRequirements) {
        System.out.println("Recruiting employee based on requirements: " + vacancyRequirements);
        Collections.shuffle(firstNames);
        Collections.shuffle(lastNames);

        return new EmployeeCandidate.Builder()
                .withPosition(vacancyRequirements.getPosition())
                .withFirstName(firstNames.iterator().next())
                .withLastName(lastNames.iterator().next())
                .withSkills(defineSkill(vacancyRequirements.getPosition()))
                .build();
    }

    private Set<Skill> defineSkill(final Position position) {
        switch (position) {
            case CTO:
                return Collections.unmodifiableSet(Stream.of(Skill.IT, Skill.MANAGEMENT).collect(Collectors.toSet()));
            case CFO:
                return Collections.unmodifiableSet(Stream.of(Skill.FINANCE, Skill.MANAGEMENT).collect(Collectors.toSet()));
            case COO:
                return Collections.unmodifiableSet(Stream.of(Skill.OPERATIONS, Skill.MANAGEMENT).collect(Collectors.toSet()));
            default:
                return Collections.emptySet();
        }
    }
}