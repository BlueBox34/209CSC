import java.io.RandomAccessFile;
import java.util.Collections;
import java.util.Random;
import java.util.Vector;

import org.w3c.dom.NamedNodeMap;

public class wtf {
    public static void main(String[] args) {
        try {
            RandomAccessFile ref = new RandomAccessFile("work.txt", "rw");
            Vector<String> name = new Vector<String>();
            while (true) {
                if (ref.getFilePointer() == ref.length())
                    break;
                if (name.size() == 0)
                    name.add(ref.readLine());

                String word = ref.readLine();
                System.out.println(ref.getFilePointer());
                boolean maikoi = false;
                for (int i = 0; i < name.size(); i++) {
                    if (name.get(i).compareTo(word) >= 0) {
                        maikoi = true;
                        name.insertElementAt(word, i);
                        break;
                    }
                }
                if (!maikoi) {
                    name.insertElementAt(word, name.size());
                }
            }

            System.out.println(name);

        } catch (Exception ex) {
            System.out.println("Bomb");
        }
    }
}