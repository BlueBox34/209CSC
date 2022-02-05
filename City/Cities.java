import java.util.Vector;

public class Cities {
    int size;
    Vector<City> cityList;

    Cities() {
        this.size = size;
        cityList = new Vector();
    }

    public int addNewCity(City newCity) {
        cityList.add(newCity);
        ((City) cityList.get(cityList.size() - 1)).setId(this.size);
        this.size++;
        return cityList.size();
    }

    public int addNewCity(String cityAscii, String country, String ISO2, String ISO3, String adminName, String capital,
            double latitude, double longitude, int population) {
        City c = new City(cityAscii, country, ISO2, ISO3, adminName, capital, latitude, longitude, population, size);
        return addNewCity(c);
    }

    public void showAllCitybyCountry(String country) {
        for (Object c : cityList) {
            String listcoun = (((City) c).getCountry());
            if (listcoun.equalsIgnoreCase(country))
                System.out.println(((City) c).getCityAscii());
        }
    }

    public String ShowMostPoplartion() {
        int maz = 0;
        String max = "";
        for (City c : cityList) {
            int num = c.getPopulation();
            if (num > maz) {
                maz = num;
                max = c.getCityAscii();

            }
        }
        return max;
    }
}
