package PBO2.model;
public class Manajer extends Pekerja{
    private static int TUNJANGAN_ESELON=1000;

    public static int getTUNJANGAN_ESELON() {
        return TUNJANGAN_ESELON;
    }
    public static void setTUNJANGAN_ESELON(int aTUNJANGAN_ESELON) {
        TUNJANGAN_ESELON = aTUNJANGAN_ESELON;
    }
    private int eselon;
    public Manajer(String nama, String tempatLahir, String tanggalLahir, String nip, int golongan, int eselon ) {
        super(nama, tempatLahir, tanggalLahir, nip, golongan);
        this.eselon = eselon;
    }
    public int getEselon() {
        return eselon;
    }
    public void setEselon(int eselon) {
        this.eselon = eselon;
    }
    public int GajiManager(){
        return Gaji()+(TUNJANGAN_ESELON*eselon);
    }
}
