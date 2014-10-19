package com.model;

/**
 *
 * @author 8.1 Enterprise
 */
public class Penduduk {
    private String nama, tempatLahir, tanggalLahir, noKTP;
    public Penduduk() {
    }

    public Penduduk(String nama, String tempatLahir, String tanggalLahir, String noKTP) throws Exception{
        this.nama = nama;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.noKTP = noKTP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) throws Exception{
        String pola="[a-z]*";
        if (nama.matches(pola))
        this.nama = nama;
        else{
            throw new Exception("Warning: Invalid Name");
        }
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) throws Exception{
        String pola="[a-z]*";
        if (tempatLahir.matches(pola))
        this.tempatLahir = tempatLahir;
        else{
            throw new Exception("Warning: Tempat hanya mengandung karakter");
        }
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) throws Exception{
        String pola="[0-3][0-9]-[0-1][1-9]-[0-9]{4}";
        if (tanggalLahir.matches(pola))
        this.tanggalLahir = tanggalLahir;
        else{
            throw new Exception("Warning: Tanggal hanya mengandung angka");
        }
    }

    public String getNoKTP() {
        return noKTP;
    }

    public void setNoKTP(String noKTP) throws Exception{
        String pola="[0-9]{16}";
        if (noKTP.matches(pola))
        this.noKTP = noKTP;
        else{
            throw new Exception("NO KTP hanya mengandung angka");
        }
    }
    
    
}
