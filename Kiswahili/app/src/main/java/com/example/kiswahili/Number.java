package com.example.kiswahili;

import android.media.Image;

public class Number {


        private String mDefaultTranslation;


    public Number(String mDefaultTranslation, String mSwahiliTranslation, int mImageResourceId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mSwahiliTranslation = mSwahiliTranslation;
        this.mImageResourceId = mImageResourceId;
    }

    private String mSwahiliTranslation;

        private int mImageResourceId = NO_IMAGE_PROVIDED;

        private  static final int NO_IMAGE_PROVIDED = -1 ;


        public Number(String defaultTranslation, String swahiliTranslation){
            mDefaultTranslation = defaultTranslation;
            mSwahiliTranslation = swahiliTranslation;

        }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getmDefaultTranslation(){
            return mDefaultTranslation;
        }

        public String getmSwahiliTranslation(){
            return mSwahiliTranslation;

        }

        //whether there is an image

        public boolean hasImage() {
            return mImageResourceId !=NO_IMAGE_PROVIDED;


        }

        }

// no need for setters since we dont expect the words to change



