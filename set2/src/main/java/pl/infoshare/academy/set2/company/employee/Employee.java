package pl.infoshare.academy.set2.company.employee;

/**
 * Created by Karol Lotkowski
 * Organization: infoShare Academy
 */
public class Employee {

    private String title;
    private ExperienceLevel experienceLevel;

    public Employee(String title, ExperienceLevel experienceLevel) {
        this.setTitle(title);
        this.setExperienceLevel(experienceLevel);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ExperienceLevel getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(ExperienceLevel experienceLevel) {
        this.experienceLevel = experienceLevel;
    }
}
