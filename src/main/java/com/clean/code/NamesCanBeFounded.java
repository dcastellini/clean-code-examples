package com.clean.code;

public class NamesCanBeFounded {

    static final int WORK_DAYS_PER_WEEK = 5;
    static final int NUMBER_OF_TASKS = 34;

    public static void main(String[] args) {

        // INCORRECT
        int t [] = {1,2,3};
        int s = 0;
        for(int j = 0 ; j < 34 ; j++){
            s += (t[j]) * 4 / 5;
        }

        // CORRECT
        int realDaysPerIdealDay = 4;
        int sum = 0;
        int taskEstimate [] = {1,2,3};
        for (int j = 0 ; j < NUMBER_OF_TASKS ; j++ ){
            int realTaskDays = taskEstimate[j] * realDaysPerIdealDay;
            int realTasksWeeks = (realTaskDays / WORK_DAYS_PER_WEEK);
            sum += realTasksWeeks;

        }


    }
}
