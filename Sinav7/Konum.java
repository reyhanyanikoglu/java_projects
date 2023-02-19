package Sinav7;

public class Konum {
    public double latitude;
    public double longitude;

    @Override
    public String toString() {
        return "Konum{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                "}";
    }

    public Konum(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
