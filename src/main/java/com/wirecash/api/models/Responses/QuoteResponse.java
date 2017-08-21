package com.wirecash.api.models.Responses;

public class QuoteResponse {
    private Double exchange_rate;
    private Double fee;
    private Double recipient_receives;
    private Double total;
    private Double amount;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    private long id;

    public Double getRecipient_receives() {
        return recipient_receives;
    }

    public void setRecipient_receives(Double recipient_receives) {
        this.recipient_receives = recipient_receives;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getExchange_rate() {
        return exchange_rate;
    }

    public void setExchange_rate(Double exchange_rate) {
        this.exchange_rate = exchange_rate;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
