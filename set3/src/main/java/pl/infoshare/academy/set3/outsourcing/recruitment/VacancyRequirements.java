package pl.infoshare.academy.set3.outsourcing.recruitment;

/**
 * Created by Karol Lotkowski
 * Organization: infoShare Academy
 */
public class VacancyRequirements {

    private final Position position;
    private final ExperienceLevel experienceLevel;

    public VacancyRequirements(Position position, ExperienceLevel experienceLevel) {
        this.position = position;
        this.experienceLevel = experienceLevel;
    }

    public Position getPosition() {
        return position;
    }

    public ExperienceLevel getExperienceLevel() {
        return experienceLevel;
    }

    @Override
    public String toString() {
        return "VacancyRequirements{" +
                "position=" + position +
                ", experienceLevel=" + experienceLevel +
                '}';
    }
}
