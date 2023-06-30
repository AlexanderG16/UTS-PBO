package model;

public abstract class PeminjamanCicilanKendaraan extends Peminjaman{
    private String noPlat, tahunRakitan, kota, warna;

    public PeminjamanCicilanKendaraan(){}
    public PeminjamanCicilanKendaraan(String tanggalPeminjaman, int totalPinjaman, double bunga, double bayaranBulanan, Pembayaran[] pembayarans, String noPlat, String tahunRakitan, String kota, String warna){
        super(tanggalPeminjaman, totalPinjaman, bunga, bayaranBulanan, pembayarans);
        this.noPlat = noPlat;
        this.tahunRakitan = tahunRakitan;
        this.kota = kota;
        this.warna = warna;
    }

    public String getNoPlat(){return this.noPlat;}
    public String getTahunRakitan(){return this.tahunRakitan;}
    public String getKota(){return this.kota;}
    public String getWarna(){return this.warna;}

    public void setNoPlat(String noPlat){this.noPlat = noPlat;}
    public void setTahunRakitan(String tahunRakitan){this.tahunRakitan = tahunRakitan;}
    public void setKota(String kota){this.kota = kota;}
    public void setWarna(String warna){this.warna = warna;}

    @Override
    public String toString(){
        return super.toString() + 
               "Nomor Plat: " + this.noPlat +
             "\nTahun Rakitan: " + this.tahunRakitan +
             "\nKota: " + this.kota +
             "\nWarna: " + this.warna + "\n";
    }
}
