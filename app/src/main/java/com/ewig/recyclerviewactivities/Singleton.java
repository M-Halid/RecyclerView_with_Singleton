package com.ewig.recyclerviewactivities;

import android.graphics.Bitmap;

public class Singleton {
    LandMark sentLandMark;
    private static Singleton singleton;
    private Bitmap sentBm;
    private Singleton() {
    }


    public LandMark getSentLandMark(){

        return sentLandMark;
    }
    public  void setSentLandMark(LandMark sentLandMark){
        this.sentLandMark=sentLandMark;
    }
    public static Singleton getInstance(){
        if (singleton==null){
            singleton= new Singleton();
        }
        return singleton;
    }
}
