import java.time.chrono.IsoChronology;

public class City {
    String cityAscii, country, ISO2, ISO3, adminName, capital;
    double lettude, longitude, latitude;
    int population, id;

    public City(String cityAscii, String country, String ISO2, String ISO3, String adminName, String capital,
            double latitude, double longitude, int population, int id) {
        this.cityAscii = cityAscii;
        this.country = country;
        this.ISO2 = ISO2;
        this.ISO3 = ISO3;
        this.adminName = adminName;
        this.capital = capital;
        this.latitude = latitude;
        this.longitude = longitude;
        this.population = population;
        this.id = id;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setCityAscii(String cityAscii) {
        this.cityAscii = cityAscii;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setISO2(String iSO2) {
        if (iSO2.length() == 2)
            ISO2 = iSO2;
    }

    public void setISO3(String iSO3) {
        if (iSO3.length() == 3)
            ISO3 = iSO3;
    }

    public void setId(int id) {
        if (id >= 0)
            this.id = id;
    }

    public void setLatitude(double latitude) {
        if (latitude >= -90 && latitude <= 90)
            this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        if (longitude >= -180 && longitude <= 180)
            this.longitude = longitude;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getAdminName() {
        return adminName;
    }

    public String getCapital() {
        return capital;
    }

    public String getCityAscii() {
        return cityAscii;
    }

    public String getCountry() {
        return country;
    }

    public String getISO2() {
        return ISO2;
    }

    public String getISO3() {
        return ISO3;
    }

    public int getId() {
        return id;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public int getPopulation() {
        return population;
    }
}