package com.mangoprojectmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name="profile")
public class Profile
{
    //@Id
    //@GeneratedValue(strategy=GenerationType.IDENTITY)
    //@Column(name="profileID ")
    private int profileId;

    //@Column(name = "firstName")
    private String firstName;

    //@Column(name = "lastName")
    private String lastName;

    //@Column(name = "wage")
    private double wage;

    //@Column(name = "profilePic")
    private String profilePic;

    //@Column(name = "facebookURL")
    private String facebookUrl;

    //@Column(name = "instagramURL")
    private String instagramUrl;

    //@Column(name = "youtubeURL")
    private String youtubeUrl;

    //@Column(name = "websiteURL")
    private String websiteUrl;

    //@Column(name = "otherURL")
    private String otherUrl;

    //@Column(name = "previousHistory")
    private String previousHistory;

    //@Column(name = "education")
    private String education;

    public Profile()
    {

    }

    public Profile(String firstName, String lastName, double wage, String profilePic, String facebookUrl, String instagramUrl, String youtubeUrl, String websiteUrl, String otherUrl, String previousHistory, String education)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.wage = wage;
        this.profilePic = profilePic;
        this.facebookUrl = facebookUrl;
        this.instagramUrl = instagramUrl;
        this.youtubeUrl = youtubeUrl;
        this.websiteUrl = websiteUrl;
        this.otherUrl = otherUrl;
        this.previousHistory = previousHistory;
        this.education = education;
    }

    public int getProfileId()
    {
        return profileId;
    }

    public void setProfileId(int profileId)
    {
        this.profileId = profileId;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public double getWage()
    {
        return wage;
    }

    public void setWage(double wage)
    {
        this.wage = wage;
    }

    public String getProfilePic()
    {
        return profilePic;
    }

    public void setProfilePic(String profilePic)
    {
        this.profilePic = profilePic;
    }

    public String getFacebookUrl()
    {
        return facebookUrl;
    }

    public void setFacebookUrl(String facebookUrl)
    {
        this.facebookUrl = facebookUrl;
    }

    public String getInstagramUrl()
    {
        return instagramUrl;
    }

    public void setInstagramUrl(String instagramUrl)
    {
        this.instagramUrl = instagramUrl;
    }

    public String getYoutubeUrl()
    {
        return youtubeUrl;
    }

    public void setYoutubeUrl(String youtubeUrl)
    {
        this.youtubeUrl = youtubeUrl;
    }

    public String getWebsiteUrl()
    {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl)
    {
        this.websiteUrl = websiteUrl;
    }

    public String getOtherUrl()
    {
        return otherUrl;
    }

    public void setOtherUrl(String otherUrl)
    {
        this.otherUrl = otherUrl;
    }

    public String getPreviousHistory()
    {
        return previousHistory;
    }

    public void setPreviousHistory(String previousHistory)
    {
        this.previousHistory = previousHistory;
    }

    public String getEducation()
    {
        return education;
    }

    public void setEducation(String education)
    {
        this.education = education;
    }

    @Override
    public String toString()
    {
        return "Profile {" +
                "profileId=" + profileId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", wage=" + wage +
                ", profilePic='" + profilePic + '\'' +
                ", facebookUrl='" + facebookUrl + '\'' +
                ", instagramUrl='" + instagramUrl + '\'' +
                ", youtubeUrl='" + youtubeUrl + '\'' +
                ", websiteUrl='" + websiteUrl + '\'' +
                ", otherUrl='" + otherUrl + '\'' +
                ", previousHistory='" + previousHistory + '\'' +
                ", education='" + education + '\'' +
                '}';
    }
}







