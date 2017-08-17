package com.wirecash.api.models.Responses;

import com.wirecash.api.models.Models.NameCode;

import java.util.ArrayList;

public class StateListResponse {

    public ArrayList<NameCode> getStates() {
        return states;
    }

    public void setStates(ArrayList<NameCode> states) {
        this.states = states;
    }

    private ArrayList<NameCode> states = new ArrayList<>();
}
