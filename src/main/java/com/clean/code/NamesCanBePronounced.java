package com.clean.code;

import java.util.Date;

public class NamesCanBePronounced {

    // INCORRECT

    class DtaRcrd102 {
        private Date genymdhms; // generation date
        private Date modymdhms; // modification date
        private final String pszqint = "102";

    }

    // CORRECT

    class Customer {
        private Date generationTimeStamp;
        private Date modificationTimeStamp;
        private final String recordId = "102";

    }

}
