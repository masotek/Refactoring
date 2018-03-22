package pl.infoshare.academy.set3.outsourcing.recruitment;

import java.util.Set;

/**
 * Created by Karol Lotkowski
 * Organization: infoShare Academy
 */
public class EmployeeCandidate {

    private final String firstName;
    private final String lastName;
    private final Position position;
    private final Set<Skill> skills;

    private EmployeeCandidate(final String firstName, final String lastName, final Position position, final Set<Skill> skills) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.skills = skills;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Position getPosition() {
        return position;
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private Position position;
        private Set<Skill> skills;

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withPosition(Position position) {
            this.position = position;
            return this;
        }

        public Builder withSkills(Set<Skill> skills) {
            this.skills = skills;
            return this;
        }

        public EmployeeCandidate build() {
            return new EmployeeCandidate(firstName, lastName, position, skills);
        }
    }
}
