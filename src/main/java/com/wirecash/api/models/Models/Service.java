package com.wirecash.api.models.Models;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private long id;
    private Float fee;
    private Double max_limit;
    private Double min_limit;
    private String delivery_type;
    private List<Payer> payers = new ArrayList<>();
    private List<ExchangeRate> exchange_rate = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = Long.valueOf(id);
    }

    public void setId(long id) {
        this.id = id;
    }

    public Float getFee() {
        return fee;
    }

    public void setFee(Float fee) {
        this.fee = fee;
    }

    public Double getMax_limit() {
        return max_limit;
    }

    public void setMax_limit(Double max_limit) {
        this.max_limit = max_limit;
    }

    public Double getMin_limit() {
        return min_limit;
    }

    public void setMin_limit(Double min_limit) {
        this.min_limit = min_limit;
    }

    public String getDelivery_type() {
        return delivery_type;
    }

    public void setDelivery_type(String delivery_type) {
        this.delivery_type = delivery_type;
    }

    public List<Payer> getPayers() {
        return payers;
    }

    public void setPayers(List<Payer> payers) {
        this.payers = payers;
    }

    public List<ExchangeRate> getExchange_rate() {
        return exchange_rate;
    }

    public void setExchange_rate(List<ExchangeRate> exchange_rate) {
        this.exchange_rate = exchange_rate;
    }
}
