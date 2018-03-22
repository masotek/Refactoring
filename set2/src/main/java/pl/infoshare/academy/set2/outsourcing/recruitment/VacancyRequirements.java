package pl.infoshare.academy.set2.outsourcing.recruitment;

import pl.infoshare.academy.set2.company.employee.ExperienceLevel;

public class VacancyRequirements {

    private final Position title;
    private final ExperienceLevel experienceLevel;

    public VacancyRequirements(Position title, ExperienceLevel experienceLevel) {
        this.title = title;
        this.experienceLevel = experienceLevel;
    }

    public Position getTitle() {
        return title;
    }

    public ExperienceLevel getExperienceLevel() {
        return experienceLevel;
    }
}
