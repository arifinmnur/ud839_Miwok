package com.example.android.miwok;

/**
 * Created by ArieDZ_2 on 9/9/2017.
 */

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    private int mImageMiwork=NO_VISIBLE_IMAGE;

    private static final int NO_VISIBLE_IMAGE= -1;

    private int mSoundMiwork;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageMiwork,int soundMiWork) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageMiwork = imageMiwork;
        mSoundMiwork=soundMiWork;
    }
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }


    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageMiwork(){ return mImageMiwork;}

    public boolean has_image(){
        return mImageMiwork != NO_VISIBLE_IMAGE;
    }

    public int getmSoundMiwork(){ return mSoundMiwork;}

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageMiwork=" + mImageMiwork +
                ", mSoundMiwork=" + mSoundMiwork +
                '}';
    }
}
