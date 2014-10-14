package TestPBO2.model;
import PBO2.model.Penduduk;
/**
 *
 * @author 8.1 Enterprise
 */
public class TestPenduduk {
    public static void main(String[] args) {
        Penduduk test= new Penduduk("Pandu", "Sleman", "20Januari1990");
        System.out.println("Nama Penduduk= "+test.getNama());
        System.out.println("Tempat Lahir= "+test.getTempatLahir());
        System.out.println("Tanggal Lahir= "+test.getTanggalLahir());
        System.out.println("");
        Penduduk test1= new Penduduk("Joseph", "Bali", "20Maret1990");
        System.out.println("Nama Penduduk= "+test1.getNama());
        System.out.println("Tempat Lahir= "+test1.getTempatLahir());
        System.out.println("Tanggal Lahir= "+test1.getTanggalLahir());
        System.out.println("");
        Penduduk test2= new Penduduk("Vinsen", "Jogja", "20JApril1990");
        System.out.println("Nama Penduduk= "+test2.getNama());
        System.out.println("Tempat Lahir= "+test2.getTempatLahir());
        System.out.println("Tanggal Lahir= "+test2.getTanggalLahir());
    }
}
