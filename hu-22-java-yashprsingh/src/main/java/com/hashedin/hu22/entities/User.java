package com.hashedin.hu22.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private int id;
    //private String name;
    private String firstName;
    private String bio;
    //private List<AreasOfInterest> =
    //profile pic
    private String lastName;
    private String userType;

 private String experience;
    private String domainExpertise;
    private String role;

    public User(int id, String firstName, String bio, String lastName, String userType, String experience, String domainExpertise, String role) {
        this.id = id;

        this.firstName = firstName;
        this.bio = bio;
        this.lastName = lastName;
        this.userType = userType;
        this.experience = experience;
        this.domainExpertise = domainExpertise;
        this.role = role;
    }

    public User() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getDomainExpertise() {
        return domainExpertise;
    }

    public void setDomainExpertise(String domainExpertise) {
        this.domainExpertise = domainExpertise;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", bio='" + bio + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userType='" + userType + '\'' +
                ", experience='" + experience + '\'' +
                ", domainExpertise='" + domainExpertise + '\'' +
                ", role='" + role + '\'' +
                '}';
    }


}
