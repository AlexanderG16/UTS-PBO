package model;

public class CicilanMobil extends PeminjamanCicilanKendaraan{
    private JenisMobil jenis;

    public CicilanMobil(){}
    public CicilanMobil(String tanggalPeminjaman, int totalPinjaman, double bunga, double bayaranBulanan, Pembayaran[] pembayarans, String noPlat, String tahunRakitan, String kota, String warna, JenisMobil jenis){
        super(tanggalPeminjaman, totalPinjaman, bunga, bayaranBulanan, pembayarans, noPlat, tahunRakitan, kota, warna);
        this.jenis = jenis;
    }

    public JenisMobil getJenis(){return this.jenis;}

    public void setJenis(JenisMobil jenis){this.jenis = jenis;}

    @Override
    public String toString(){
        return "Peminjaman Cicilan Mobil:========================================" + "\n" + super.toString() +
               "\nJenis Mobil: " + this.jenis + "\n";
    }
}
