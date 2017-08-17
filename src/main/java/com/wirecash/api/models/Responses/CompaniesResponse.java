package com.wirecash.api.models.Responses;

import com.wirecash.api.models.Models.Company;

import java.util.ArrayList;

public class CompaniesResponse {
    private ArrayList<Company> companies = new ArrayList<>();

    public ArrayList<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(ArrayList<Company> companies) {
        this.companies = companies;
    }
}
