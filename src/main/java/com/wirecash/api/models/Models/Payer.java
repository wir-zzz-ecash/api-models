package com.wirecash.api.models.Models;


public class Payer {
    private String payer_logo;
    private Integer id;
    private String payer_name;

    public String getPayer_logo() {
        return payer_logo;
    }

    public void setPayer_logo(String payer_logo) {
        this.payer_logo = "https://dm5y4fw575u2h.cloudfront.net/assets/wirecashfunnel/master/images/providers/" + payer_logo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPayer_name() {
        return payer_name;
    }

    public void setPayer_name(String payer_name) {
        this.payer_name = payer_name;
    }
}
