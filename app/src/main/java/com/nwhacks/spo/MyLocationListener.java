package com.nwhacks.spo;

/**
 * Created by tarik on 1/13/2018.
 */

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;


public class MyLocationListener implements LocationListener {


    private Location location;

    public MyLocationListener() {
        this.location = new Location("");
    }
    @Override
    public void onStatusChanged(String s, int i, Bundle b) {
        //
    }

    @Override
    public void onProviderEnabled(String s) {
        //
    }

    @Override
    public void onProviderDisabled(String s) {
        //
    }

    @Override
    public void onLocationChanged(Location location) {
        this.location = location;

    }

    public double getLongitude() {
        return this.location.getLongitude();
    }

    public double getLatitude() {
        return this.location.getLatitude();
    }
}
