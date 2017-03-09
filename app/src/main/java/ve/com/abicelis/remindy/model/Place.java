package ve.com.abicelis.remindy.model;

/**
 * Created by abice on 8/3/2017.
 */

public class Place {
    private int id;
    private String name;
    private String address;
    private double latitude;
    private double longitude;
    private float radius;
    private boolean isOneOff;

    public Place(String name, String address, double latitude, double longitude, float radius, boolean isOneOff) {
        this.name = name;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.radius = radius;
        this.isOneOff = isOneOff;
    }

    public Place(int id, String name, String address, double latitude, double longitude, float radius, boolean isOneOff) {
        this(name, address, latitude, longitude, radius, isOneOff);
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
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

    public float getRadius() {
        return radius;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }



    @Override
    public String toString() {
        return  "ID=" + id + "\r\n" +
                " name=" + name + "\r\n" +
                " address=" + address + "\r\n" +
                " latitude=" + latitude + "\r\n" +
                " longitude=" + longitude + "\r\n" +
                " radius=" + radius;
    }
}
