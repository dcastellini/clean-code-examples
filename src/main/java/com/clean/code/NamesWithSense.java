package com.clean.code;

import java.util.ArrayList;
import java.util.List;

public class NamesWithSense {

    public static final int STATUS_VALUE = 0;
    public static final int FLAGGED = 4;

    // INCORRECT

    public List<int []> getThem(){
        List<int []> theList = new ArrayList<int []>();
        List<int []> list1 = new ArrayList<int []>();
        for (int[] x : theList){
            if(x[0] == 4)
                list1.add(x);
        }
        return list1;
    }

    // CORRECT

    public List<int []> getFlaggedCells(){
        List<int []> gameBoard = new ArrayList<int []>();
        List<int []> flaggedCells = new ArrayList<int []>();
        for (int[] cell : gameBoard){
            if(cell[STATUS_VALUE] == FLAGGED)
                flaggedCells.add(cell);
        }
        return flaggedCells;
    }

}
