package com.qiao.weixin.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.NotNull;

/**
 * @author qiao
 * email tyrantqiao@icloud.com
 * 2017/9/11 22:02
 */
@Entity
public class LaGou {
    private String Language;
    private String Description;
    private String Experience;
    private String Education;
    private int Submitted;
    private int Total;
    private String CompanyScale;
    private String Location;
    private String Status;
    private String Name;
    @PrimaryKeyJoinColumn
    @NotNull
    @GeneratedValue
    private int id;

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getExperience() {
        return Experience;
    }

    public void setExperience(String experience) {
        Experience = experience;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    public int getSubmitted() {
        return Submitted;
    }

    public void setSubmitted(int submitted) {
        Submitted = submitted;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int total) {
        Total = total;
    }

    public String getCompanyScale() {
        return CompanyScale;
    }

    public void setCompanyScale(String companyScale) {
        CompanyScale = companyScale;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
