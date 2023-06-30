package model;

public class PeminjamanUang extends Peminjaman{
    private String jaminan;

    public PeminjamanUang(){}
    public PeminjamanUang(String tanggalPeminjaman, int totalPinjaman, double bunga, double bayaranBulanan, Pembayaran[] pembayarans, String jaminan){
        super(tanggalPeminjaman, totalPinjaman, bunga, bayaranBulanan, pembayarans);
        this.jaminan = jaminan;
    }

    public String getJaminan(){return this.jaminan;}

    public void setJaminan(String jaminan){this.jaminan = jaminan;}

    @Override
    public String toString(){
        return "Peminjaman Uang:" + "\n" + super.toString() +
               "Jaminan: " + this.jaminan + "\n";
    }
}
