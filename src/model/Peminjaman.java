package model;

public abstract class Peminjaman {
    private String tanggalPengajuan;
    private int totalPinjaman;
    private double bunga, bayaranBulanan;
    private Pembayaran[] pembayarans;

    public Peminjaman(){}
    public Peminjaman(String tanggalPeminjaman, int totalPinjaman, double bunga, double bayaranBulanan, Pembayaran[] pembayarans){
        this.tanggalPengajuan = tanggalPeminjaman;
        this.totalPinjaman = totalPinjaman;
        this.bayaranBulanan = bayaranBulanan;
        this.bunga = bunga;
        this.pembayarans = pembayarans;
    }

    public String getTanggalPengajuan(){return this.tanggalPengajuan;}
    public int getTotalPinjaman(){return this.totalPinjaman;}
    public double getBunga(){return this.bunga;}
    public double getBayaranBulanan(){return this.bayaranBulanan;}
    public Pembayaran[] getPembayaran(){return this.pembayarans;}
    
    public void setTanggalPengajuan(String tanggalPengajuan){this.tanggalPengajuan = tanggalPengajuan;}
    public void setTotalPinjaman(int totalPinjaman){this.totalPinjaman = totalPinjaman;}
    public void setBunga(double bunga){this.bunga = bunga;}
    public void setBayaranBulanan(double bayaranBulanan){this.bayaranBulanan = bayaranBulanan;}
    public void setPembayaran(Pembayaran[] pembayarans){this.pembayarans = pembayarans;}
    
    public double hitungBayaranBulanan(int totalPinjaman, double bunga, int jumlahBulan){
        this.pembayarans = new Pembayaran[jumlahBulan];
        return totalPinjaman+(totalPinjaman*bunga);
    }

    public String toString(){
        String text = "";
        for (int i = 0; i < pembayarans.length; i++) {
            text += "\t" + (i+1) + ". " + pembayarans[i].toString() + "\n";
        }
        return "Tanggal Pengajuan: " + this.tanggalPengajuan +
             "\nTotal Pinjaman: " + this.totalPinjaman +
             "\nBunga: " + this.bunga*100 + 
            "%\nBayaran Bulanan: " + this.bayaranBulanan +
             "\nList Pembayaran:\n" + text;
    }
}
