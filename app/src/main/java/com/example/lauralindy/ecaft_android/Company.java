package com.example.lauralindy.ecaft_android;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lauralindy on 4/17/18.
 */

public class Company {
    public String description;
    public String id;
    public List<String> jobtitles;
    public List<String> jobtypes;
    public String location;
    public List<String> majors;
    public String name;
    public boolean optcpt;
    public boolean sponsor;
    public String website;

    public Company(){}

    public Company (String id, String description, String jobtitles,
                           String jobtypes, String location, String majors,
                           String name, boolean optcpt, boolean sponsor, String
                                   website) {
        this.id = id;
        this.description = description;
        this.jobtitles = Arrays.asList(jobtitles.split(","));
        this.jobtypes = Arrays.asList(jobtypes.split(","));
        this.location = location;
        this.majors = Arrays.asList(majors.split(","));;
        this.name = name;
        this.optcpt = optcpt;
        this.sponsor = sponsor;
        this.website = website;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setInformation(String description) {
        this.description = description;
    }

    public List<String> getJobtitles() {
        return jobtitles;
    }

    public void setJobtitles(List<String> jobtitles) {
        this.jobtitles = jobtitles;
    }

    public void setJobtitles(String jobtitles) { this.jobtitles = Arrays.asList(jobtitles.split(",")); }

    public List<String> getJobtypes() {
        return jobtypes;
    }

    public void setJobtypes(List<String> jobtypes) {
        this.jobtypes = jobtypes;
    }

    public void setJobtypes(String jobtypes) { this.jobtypes = Arrays.asList(jobtypes.split(",")); }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> getMajors() {
        return majors;
    }

    public void setMajors(List<String> majors) {
        this.majors = majors;
    }

    public void setMajors(String majors) { this.majors = Arrays.asList(majors.split(",")); }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOptcpt() {
        return optcpt;
    }

    public void setOptcpt(boolean optcpt) {
        this.optcpt = optcpt;
    }

    public boolean isSponsor() {
        return sponsor;
    }

    public void setSponsor(boolean sponsor) {
        this.sponsor = sponsor;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
