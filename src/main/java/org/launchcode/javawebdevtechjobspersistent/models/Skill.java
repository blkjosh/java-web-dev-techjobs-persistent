package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotNull
    @Size(min = 3, message = "Description must be at least 3 characters")
    private String skillDetails;

    public Skill(@NotNull @Size(min = 3, message = "Description must be at least 3 characters") String skillDetails) {
        this.skillDetails = skillDetails;
    }

    public String getSkillDetails() {
        return skillDetails;
    }

    public void setSkillDetails(String skillDetails) {
        this.skillDetails = skillDetails;
    }

    public Skill() {}
}