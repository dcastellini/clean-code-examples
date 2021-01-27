package com.clean.code.objects;

public class HourlyEmployee extends Employee{

    @Override
    public boolean isPayday() {
        return false;
    }

    @Override
    public double calculatePay() {
        return 0;
    }

    @Override
    public void deliverPay(double pay) {

    }
}
