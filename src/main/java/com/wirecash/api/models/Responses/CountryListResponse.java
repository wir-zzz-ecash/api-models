package com.wirecash.api.models.Responses;

import com.wirecash.api.models.Models.NameCode;

import java.util.ArrayList;

public class CountryListResponse {
    private ArrayList<NameCode> countries = new ArrayList<>();

    public ArrayList<NameCode> getCountries() {
        return countries;
    }

    public void setCountries(ArrayList<NameCode> countries) {
        this.countries = countries;
    }
}
