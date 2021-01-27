package com.clean.code.objects;

public abstract class Employee {
    public abstract boolean isPayday();
    public abstract double calculatePay();
    public abstract void deliverPay(double pay);
    public String type;

    public String getType() {
        return type;
    }
}
