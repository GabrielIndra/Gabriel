package Stream;
import java.io.Serializable;
/**
 *
 * @author 8.1 Enterprise
 */
public class Pekerja extends Penduduk implements Serializable{
    private String nip;
    private int golongan;
    public String getNip() {
        return nip;
    }
    public void setNip(String nip) {
        this.nip = nip;
    }
    public int getGolongan() {
        return golongan;
    }
    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }
    public Pekerja(String nama, String nip, String tempatLahir, String tanggalLahir, int golongan) {
        super(nama, tempatLahir, tanggalLahir);
        this.nip = nip;
        this.golongan = golongan;
    }
    public Pekerja() {
    }
}
