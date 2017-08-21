package com.wirecash.api.models.Request;

public class QuoteRequest {
    private Long service_id;
    private Long payer_id = 0L;
    private String currency_symbol;
    private Double amount;

    public Long getService_id() {
        return service_id;
    }

    public void setService_id(Long service_id) {
        this.service_id = service_id;
    }

    public QuoteRequest withServiceId(Long serviceId) {
        this.service_id = serviceId;
        return this;
    }

    public Long getPayer_id() {
        return payer_id;
    }

    public void setPayer_id(Long payerId) {
        this.payer_id = payerId;
    }

    public QuoteRequest withPayerId(Long payerId) {
        this.payer_id = payerId;
        return this;
    }

    public String getCurrency_symbol() {
        return currency_symbol;
    }

    public void setCurrency_symbol(String currency_symbol) {
        this.currency_symbol = currency_symbol;
    }

    public QuoteRequest withCurrencySymbol(String currencySymbol) {
        this.currency_symbol = currencySymbol;
        return this;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public QuoteRequest withAmount(Double amount) {
        this.amount = amount;
        return this;
    }
}
