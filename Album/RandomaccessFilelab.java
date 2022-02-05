package Album;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomaccessFilelab {
    public static void main(String[] args) {
        try {
            RandomAccessFile ref = new RandomAccessFile("song.dat", "rw");
            Song si = new Song(102, "Last Fridat Night", "Pop", 3.20, "Katy Perry");
            System.out.println(si.getTitle() + " " + si.getArtist());
            Song sii = new Song(102, "The Black Hawk War", "Rap", 4.52, "Sufjan Stevens");
            System.out.println(sii.getTitle() + " " + sii.getArtist());

            ref.writeInt(si.getId());
            byte[] title = new byte[20];
            title = si.getTitle().concat("                    ").getBytes();
            ref.write(title, 0, 20);

            byte[] genre = new byte[10];
            genre = si.getGenre().concat("         ").getBytes();
            ref.write(genre, 0, 10);

            ref.writeDouble(si.getDuration());

            byte[] artist = new byte[20];
            artist = si.getArtist().concat("                 ").getBytes();
            ref.write(artist, 0, 20);

            ref.writeInt(sii.getId());
            title = sii.getTitle().concat("                    ").getBytes();
            ref.write(title, 0, 20);

            genre = sii.getGenre().concat("         ").getBytes();
            ref.write(genre, 0, 10);

            ref.writeDouble(sii.getDuration());

            artist = sii.getArtist().concat("                 ").getBytes();
            ref.write(artist, 0, 20);

            System.out.println(ref.getFilePointer());
            ref.seek(4);
            System.out.println(new String(title));
            ref.seek(34);
            double songduration = ref.readDouble();
            System.out.println(songduration);

            ref.seek(96);
            songduration = ref.readDouble();
            System.out.println(songduration);

        } catch (Exception ex) {
            System.out.println("error");
        }

    }
}
