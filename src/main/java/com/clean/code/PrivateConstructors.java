package com.clean.code;

public class PrivateConstructors {

    private int number;

    public PrivateConstructors(int number){
        this.number = number;
    }

    // HIDDING CONSTRUCTORS WITH HELPED NAMES
    public static PrivateConstructors FromRealNumber(int number){
        return new PrivateConstructors(number);

    }

}
