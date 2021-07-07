package com.example.android.miwok;

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId;





    public Word(String defaultTranslation, String miwokTranslation,int imageResourceId)

    {

        mDefaultTranslation = defaultTranslation;

        mMiwokTranslation = miwokTranslation;

        mImageResourceId=imageResourceId;

    }
    public Word(String defaultTranslation, String miwokTranslation)

    {

        mDefaultTranslation = defaultTranslation;

        mMiwokTranslation = miwokTranslation;


    }
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public void setDefaultTranslation(String mDefaultTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public void setMiwokTranslation(String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
    }
    public int getImageResourceId() {
        return mImageResourceId;
    }

    public void setImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }



}
