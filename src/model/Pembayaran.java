package model;

public class Pembayaran {
    private String tanggalPembayaran;
    private MetodePembayaran metode;

    public Pembayaran(){}
    public Pembayaran(String tanggalPembayaran, MetodePembayaran metode){
        this.tanggalPembayaran = tanggalPembayaran;
        this.metode = metode;
    }

    public String getTanggalPembayaran(){return this.tanggalPembayaran;}
    public MetodePembayaran getMetode(){return this.metode;}

    public void setTanggalPembayaran(String tanggalPembayaran){this.tanggalPembayaran = tanggalPembayaran;}
    public void setMetode(MetodePembayaran metode){this.metode = metode;}

    public String toString(){
        return "Tanggal Pembayaran: " + this.tanggalPembayaran +
             " - Metode Pembayaran: " + this.metode;
    }
}
