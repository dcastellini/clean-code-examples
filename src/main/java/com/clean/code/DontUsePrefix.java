package com.clean.code;

public class DontUsePrefix {

    // INCORRECT
    public class PartIncorrect {
        private String m_dsc;
        void setDescription(String description){
            m_dsc = description;
        }
    }

    // CORRECT
    public class PartCorrect {
        private String description;
        void setDescription(String description){
            this.description = description;
        }
    }

}
