package model;

public class CicilanMotor extends PeminjamanCicilanKendaraan{
    private JenisMotor jenis;

    public CicilanMotor(){}
    public CicilanMotor(String tanggalPeminjaman, int totalPinjaman, double bunga, double bayaranBulanan, Pembayaran[] pembayarans, String noPlat, String tahunRakitan, String kota, String warna, JenisMotor jenis){
        super(tanggalPeminjaman, totalPinjaman, bunga, bayaranBulanan, pembayarans, noPlat, tahunRakitan, kota, warna);
        this.jenis = jenis;
    }

    public JenisMotor getJenis(){return this.jenis;}

    public void setJenis(JenisMotor jenis){this.jenis = jenis;}

    @Override
    public String toString(){
        return "Peminjaman Cicilan Motor:========================================" + "\n" + super.toString() +
               "\nJenis Motor: " + this.jenis + "\n";
    }
}
