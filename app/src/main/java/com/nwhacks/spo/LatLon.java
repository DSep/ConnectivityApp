package com.nwhacks.spo;

/**
 * Created by tarik on 1/14/2018.
 */

public class LatLon {
    private double lat;
    private double lon;

    public LatLon(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LatLon)) return false;

        LatLon latLon = (LatLon) o;

        if (Double.compare(latLon.lat, lat) != 0) return false;
        return Double.compare(latLon.lon, lon) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(lat);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(lon);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public double getLon() {
        return lon;
    }
}
