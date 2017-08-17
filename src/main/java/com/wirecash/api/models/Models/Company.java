package com.wirecash.api.models.Models;


import java.util.ArrayList;
import java.util.HashMap;

public class Company {
    private String company_logo;
    private String company_name;
    private Integer rating;
    private String description;
    private Integer id;
    private HashMap<String, ArrayList<Service>> services = new HashMap<>();

    public String getCompany_logo() {
        return company_logo;
    }

    public void setCompany_logo(String company_logo) {
        this.company_logo = "https://dm5y4fw575u2h.cloudfront.net/assets/wirecashfunnel/master/images/providers/" + company_logo;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public HashMap<String, ArrayList<Service>> getServices() {
        return services;
    }

    public void setServices(HashMap<String, ArrayList<Service>> services) {
        this.services = services;
    }
}
