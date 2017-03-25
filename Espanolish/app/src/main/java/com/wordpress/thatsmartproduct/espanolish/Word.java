package com.wordpress.thatsmartproduct.espanolish;

/**
 * Created by wssyed on 1/4/2017.
 */

public class Word {
    private String mEspanolTranslation;
    private String mDefaultTranslation;

    protected Word(String defaultTranslation, String espanolTranslation) {
        mEspanolTranslation = espanolTranslation;
        mDefaultTranslation = defaultTranslation;
    }


    public String getEspanolTranslation() {
        return mEspanolTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

}

