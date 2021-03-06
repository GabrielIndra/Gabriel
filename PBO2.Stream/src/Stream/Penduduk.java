package Stream;
import java.io.Serializable;
/**
 *
 * @author 8.1 Enterprise
 */
public class Penduduk implements Serializable {
    public String nama;
    public String tempatLahir;
    public String tanggalLahir;
    public Penduduk() {
    }
    public Penduduk(String nama, String tempatLahir, String tanggalLahir) {
        this.nama = nama;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getTempatLahir() {
        return tempatLahir;
    }
    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }
    public String getTanggalLahir() {
        return tanggalLahir;
    }
    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
}
