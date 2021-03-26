package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


@Entity
public class Employer extends AbstractEntity {

    //havent decided relationship *many to one?
    @NotNull
    private String location;

    public Employer(@NotNull String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employer() {}
}
