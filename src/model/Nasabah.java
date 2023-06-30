package model;

import java.util.ArrayList;

public class Nasabah {
    private String nama, nik, noTelp;
    private ArrayList<Peminjaman> peminjamans;

    public Nasabah(){}
    public Nasabah(String nama, String nik, String noTelp, ArrayList<Peminjaman> peminjamans){
        this.nama = nama;
        this.nik = nik;
        this.noTelp = noTelp;
        this.peminjamans = peminjamans;
    }

    public String getNama(){return this.nama;}
    public String getNIK(){return this.nik;}
    public String getNoTelp(){return this.noTelp;}
    public ArrayList<Peminjaman> getPeminjaman(){return this.peminjamans;}

    public void setNama(String nama){this.nama = nama;}
    public void setNIK(String nik){this.nik = nik;}
    public void setNoTelp(String noTelp){this.noTelp = noTelp;}
    public void setPeminjaman(ArrayList<Peminjaman> peminjamans){this.peminjamans = peminjamans;}

    public String toString(){
        String text = "";
        for (int i = 0; i < this.peminjamans.size(); i++) {
            text += (i+1) + ". " + this.peminjamans.get(i).toString() + "\n";
        }
        return "Nama: " + this.nama +
             "\nNIK: " + this.nik +
             "\nNo. Telepon: " + this.noTelp +
             "\nList Peminjaman Nasabah " + this.nama + ":\n" +
             text;
    }
}
