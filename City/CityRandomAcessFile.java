import java.io.RandomAccessFile;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class CityRandomAcessFile {
    public static void main(String[] args) {
        try {
            RandomAccessFile fPointer = new RandomAccessFile("city.dat", "rw");
            byte[] x = new byte[150];
            fPointer.read(x, 0, 150);
            System.out.println(new String((x)));
            fPointer.seek(381);
            System.out.println(fPointer.readInt());
            boolean notfound = true;
            int recored = 0;
            Vector citylist = new Vector();
            while (notfound) {
                fPointer.seek(recored * 385);
                fPointer.read(x, 0, 150);
                String city = new String(x);
                city = city.trim();
                // System.out.println(new String(x));
                if (city.equalsIgnoreCase("Hanawa")) {
                    System.out.println(recored);
                    fPointer.seek(recored * 385 + 381);
                    System.out.println(city + " " + fPointer.readInt());
                    notfound = false;
                }
                recored++;
            }
            recored = 0;
            while (recored * 385 < fPointer.length()) {
                fPointer.seek(recored * 385);
                fPointer.read(x, 0, 150);
                String city = new String(x);
                city = city.trim();
                citylist.add(city);
                recored++;
            }

            Collections.sort(citylist);
            for (int i = 0; i < citylist.size() - 1; i++) {
                if (citylist.get(i).equals(citylist.get(i + 1))) {
                    System.out.print("");
                } else
                    System.out.println(citylist.get(i));
            }
            for (int i = 0; i < citylist.size() - 1; i++) {
                if (citylist.get(i).equals(citylist.get(i + 1))) {
                    System.out.println(citylist.get(i) + " = " + citylist.get(i + 1));
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
