package com.clean.code;

import com.clean.code.objects.*;

public class SwitchHide implements EmployeeFactory {

    public final static String COMMISIONED = "commisioned";
    public final static String HOURLY = "hourly";
    public final static String SALARIED = "salaried";

    @Override
    public Employee makeEmployee(Employee r) throws Exception {
        switch(r.getType()){
            case COMMISIONED:
                return new ComissionedEmployee();
            case HOURLY:
                return new HourlyEmployee();
            case SALARIED:
                return new SalariedEmploye();
            default:
                throw new Exception();
        }

    }
}
