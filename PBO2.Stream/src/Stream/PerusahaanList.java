package Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author 8.1 Enterprise
 */
public class PerusahaanList {

    public static ArrayList<Pekerja> listPekerja = new ArrayList<Pekerja>();

    public static void tambahPekerja(Pekerja pekerja) {
        listPekerja.add(pekerja);
    }

    public static void simpanFilePekerja() throws FileNotFoundException, IOException {
        if (listPekerja.isEmpty()) {
            System.out.println("list pekerja masih kosong");
        } else {
            File infile = new File("Pekerja.dat");
            FileOutputStream os = new FileOutputStream(infile);
            String temp = " ";

            for (int i = 0; i < listPekerja.size(); i++) {
                temp = temp + listPekerja.get(i).getNip() + "\t" + listPekerja.get(i).getNama() + "\t"
                        + listPekerja.get(i).getTempatLahir() + "\t" + listPekerja.get(i).getTanggalLahir()
                        + "\t" + listPekerja.get(i).getGolongan() + "\n";
            }
            os.write(temp.getBytes());
            os.close();

            //buat file
            //buat outputStream
            //buat temp string
            //    looping sebanyak jumlah pekerja
            //temp = temp + nip +"\t"
            //outputStream.write(temp.getBytes);
            //outputStream.close
        }
    }
    public static void SimpanFile() throws Exception{
         if (listPekerja.isEmpty()) {
            System.out.println("list pekerja masih kosong");
        } else {
            File infile = new File("Pekerja2.dat");
            FileOutputStream os = new FileOutputStream(infile);
             ObjectOutputStream temp = new ObjectOutputStream(os);

//            for (int i = 0; i < listPekerja.size(); i++) {
//              //simpan obyek
//                temp.writeObject(listPekerja.get(i));
//            }
            //os.write(temp.getBytes());
             temp.writeObject(listPekerja);
            os.close();
    }
}
  public static void bacaSimpanFile() throws Exception{
        
            File infile = new File("Pekerja2.dat");
           FileInputStream os = new FileInputStream(infile);
            
             //ObjectInputStream temp = new ObjectInputStream(os);
             ObjectInputStream temp = new ObjectInputStream(os);
             listPekerja = (ArrayList<Pekerja>) temp.readObject();

            os.close();
    }
}   

