package main;

import java.util.ArrayList;
import java.util.Random;

import controller.Controller;
import model.CicilanMobil;
import model.CicilanMotor;
import model.JenisMobil;
import model.JenisMotor;
import model.MetodePembayaran;
import model.Nasabah;
import model.Pembayaran;
import model.Peminjaman;
import model.PeminjamanUang;

public class Main {
    static ArrayList<Peminjaman> peminjamans = new ArrayList<Peminjaman>(){
        {
            add(new CicilanMotor("12/01/2019", 20000000, 0.06, 0, null, "D 1234 ABC", "2011", "Bandung", "Hitam", JenisMotor.BEBEK));
            add(new CicilanMobil("21/03/2015", 200000000, 0.06, 0, null, "D 2345 ABC", "2017", "Jakarta", "Merah", JenisMobil.MPV));
            add(new CicilanMobil("21/03/2016", 300000000, 0.05, 0, null, "D 2345 ABD", "2018", "Jakarta", "Merah", JenisMobil.MPV));
            add(new CicilanMotor("12/02/2019", 30000000, 0.05, 0, null, "D 1234 ABD", "2012", "Jakarta", "Putih", JenisMotor.BEBEK));
            add(new CicilanMobil("21/03/2017", 400000000, 0.04, 0, null, "D 2345 ABE", "2019", "Jakarta", "Merah", JenisMobil.MPV));
            add(new CicilanMotor("12/03/2019", 40000000, 0.04, 0, null, "D 1234 ABE", "2013", "Surabaya", "Ungu", JenisMotor.BEBEK));
            add(new CicilanMotor("12/06/2019", 70000000, 0.01, 0, null, "D 1234 ABH", "2016", "Jukut", "Aqua", JenisMotor.TRAIL));
            add(new CicilanMobil("21/03/2018", 500000000, 0.03, 0, null, "D 2345 ABF", "2020", "Jakarta", "Merah", JenisMobil.PICKUP));
            add(new PeminjamanUang("15/03/2021", 10000000, 0.03, 0, null, "Nyawa"));
            add(new PeminjamanUang("15/04/2021", 1000000, 0.03, 0, null, "Nyawa"));
            add(new CicilanMobil("21/03/2019", 600000000, 0.02, 0, null, "D 2345 ABG", "2021", "Jakarta", "Merah", JenisMobil.MINIVAN));
            add(new PeminjamanUang("15/05/2021", 10000000, 0.03, 0, null, "Nyawa"));
            add(new PeminjamanUang("15/06/2021", 100000000, 0.03, 0, null, "Nyawa"));
            add(new CicilanMotor("12/04/2019", 50000000, 0.03, 0, null, "D 1234 ABF", "2014", "Bekasi", "Merah", JenisMotor.ELEKTRIK));
            add(new PeminjamanUang("15/07/2021", 10000000, 0.03, 0, null, "Nyawa"));
            add(new CicilanMobil("21/03/2020", 700000000, 0.01, 0, null, "D 2345 ABH", "2022", "Jakarta", "Merah", JenisMobil.SEDAN));
            add(new PeminjamanUang("15/08/2021", 1000000, 0.03, 0, null, "Nyawa"));
            add(new CicilanMotor("12/05/2019", 60000000, 0.02, 0, null, "D 1234 ABG", "2015", "Tangerang", "Magenta", JenisMotor.SPORT));
        }
    };
    public static ArrayList<Nasabah> nasabah = new ArrayList<Nasabah>(){
        {
            add(new Nasabah("Adidi", "112200", "082212341234", new ArrayList<Peminjaman>(peminjamans.subList(0, 3))));
            add(new Nasabah("Adudu", "112201", "082212341235", new ArrayList<Peminjaman>(peminjamans.subList(3, 6))));
            add(new Nasabah("Adodo", "112202", "082212341236", new ArrayList<Peminjaman>(peminjamans.subList(6, 9))));
            add(new Nasabah("Adada", "112203", "082212341237", new ArrayList<Peminjaman>(peminjamans.subList(9, 12))));
            add(new Nasabah("Cinta", "112204", "082212341238", new ArrayList<Peminjaman>(peminjamans.subList(12, 18))));
        }
    };
    public static void main(String[] args) {
        Random rand = new Random();
        Controller c = new Controller();
        for (Nasabah i: nasabah){
            for (Peminjaman j: i.getPeminjaman()){
                j.setBayaranBulanan(j.hitungBayaranBulanan(j.getTotalPinjaman(), j.getBunga(), rand.nextInt(1,13)));
            }
        }
        for (Nasabah i: nasabah){
            for (Peminjaman j: i.getPeminjaman()){
                Pembayaran[] temp = j.getPembayaran();
                for (int k = 0; k < temp.length; k++) {
                    temp[k] = new Pembayaran(rand.nextInt(1, 28) + "/" + rand.nextInt(1, 13) + "/" + rand.nextInt(2000, 2023), MetodePembayaran.BCA);
                }
                j.setPembayaran(temp);
            }
        }

        System.out.println(c.printDataSemuaNasabah(nasabah)); // Print Semua Nasabah
        System.out.println(c.printDataRiwayatPembayaran("112200", nasabah)); // Print Riwayat Pembayaran Nasabah 'Adidi'
        System.out.println(c.printJenisMotorTerbanyak(nasabah)); // Print Jenis Motor Terbanyak
        System.out.println();
        System.out.println(c.printJenisMobilTerbanyak(nasabah)); // Print Jenis Mobil Terbanyak
    }
}
