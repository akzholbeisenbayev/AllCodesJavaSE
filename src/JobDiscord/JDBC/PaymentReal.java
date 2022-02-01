package JobDiscord.JDBC;

public class PaymentReal implements Payments
{
    String type;

    @Override
    public void WhatType() {
        System.out.println(getType());
    }

    public PaymentReal(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "PaymentReal{" +
                "type='" + type + '\'' +
                '}';
    }
}
