package com.sentes.forcharity.erdbebeninfo;

/**
 * Created by Faßreiter on 26.01.2017.
 */

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private String mDate;


    private String mUrl;


    private long mTimeInMilliseconds;

    public Earthquake(double mMagnitude, String mLocation, long timeInMilliseconds, String url) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }




    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmDate() {
        return mDate;
    }
    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getmUrl() {
        return mUrl;
    }


}
