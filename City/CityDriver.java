import java.io.RandomAccessFile;
import java.util.Vector;

public class CityDriver {
    public static void main(String[] args) {
        try {
            RandomAccessFile fPointer = new RandomAccessFile("city.dat", "rw");
            byte[] x = new byte[150];
            Vector citylist = new Vector();
            Cities citieslist = new Cities();
            String cityAscii, country, ISO2, ISO3, adminName, capital;
            double lettude, longitude, latitude;
            int population;
            int count = 0;
            while (count * 385 < fPointer.length()) {
                fPointer.seek(count * 385);
                fPointer.read(x, 0, 150);
                String city = new String(x);
                city = city.trim();
                latitude = fPointer.readDouble();
                longitude = fPointer.readDouble();
                fPointer.read(x, 0, 50);
                country = new String(x).trim();
                fPointer.read(x, 0, 2);
                ISO2 = new String(x, 0, 2);
                fPointer.read(x, 0, 3);
                ISO3 = new String(x, 0, 3);
                fPointer.read(x, 0, 150);
                adminName = new String(x).trim();
                fPointer.read(x, 0, 10);
                capital = new String(x).trim();
                population = fPointer.read();
                citieslist.addNewCity(city, country, ISO2, ISO3, adminName, capital, latitude, longitude, population);
                count++;
            }
            // System.out.println((((City) citieslist.cityList.get(2)).getCityAscii()));
            // citieslist.showAllCitybyCountry("japan");
            System.out.println(citieslist.ShowMostPoplartion());

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}