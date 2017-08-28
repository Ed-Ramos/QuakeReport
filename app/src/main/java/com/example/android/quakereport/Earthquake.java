package com.example.android.quakereport;

/**
 * Created by Edwin on 8/2/2017.
 */

public class Earthquake {

    /** Value that represents magnitude of quake*/
    private double mMagnitude;

    /** Value that represents city where quake occured*/
    private String mLocation;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    /** Website URL of the earthquake */
    private String mUrl;

    public Earthquake(double Magnitude, String Location, long timeInMilliseconds, String url) {
        mMagnitude = Magnitude;
        mLocation = Location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }

}
