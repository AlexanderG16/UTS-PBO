package controller;

import java.util.ArrayList;
import java.util.HashMap;

import model.CicilanMobil;
import model.CicilanMotor;
import model.JenisMobil;
import model.JenisMotor;
import model.Nasabah;
import model.Pembayaran;
import model.Peminjaman;

public class Controller {
    public Controller(){}

    public String printDataSemuaNasabah(ArrayList<Nasabah> nasabah){
        String text = "";
        for (Nasabah i: nasabah){
            text += i.toString() + "\n";
        }
        return text;
    }

    public String printDataRiwayatPembayaran(String nik, ArrayList<Nasabah> nasabah){
        String text = "";
        int counter = 1;
        for (Nasabah i: nasabah){
            if (i.getNIK().equals(nik)){
                text += "Riwayat Pembayaran Nasabah " + i.getNama() + " - " + i.getNIK() + ":\n\n";
                for (Peminjaman j: i.getPeminjaman()){
                    for (Pembayaran k: j.getPembayaran()){
                        text += counter + ". " + k.toString() + "\n";
                        counter++;
                    }
                }
            }
        }
        return text;
    }

    public String printJenisMotorTerbanyak(ArrayList<Nasabah> nasabah){
        HashMap<JenisMotor, Integer> counter = new HashMap<JenisMotor, Integer>();
        for (JenisMotor i: JenisMotor.values()){
            counter.put(i, 0);
        }
        for (Nasabah i: nasabah){
            for (Peminjaman j: i.getPeminjaman()){
                if (j instanceof CicilanMotor){
                    CicilanMotor temp = (CicilanMotor) j;
                    counter.put(temp.getJenis(), counter.get(temp.getJenis())+1);
                }
            }
        }

        JenisMotor terbanyak = JenisMotor.BEBEK;
        int count = Integer.MIN_VALUE;
        for (JenisMotor i: counter.keySet()){
            if (counter.get(i) > count){
                terbanyak = i;
                count = counter.get(i);
            }
        }

        return "Jenis Motor Terbanyak yang Dipinjam:\nJenis: " + terbanyak + ", Jumlah Pinjaman: " + count;
    }
    
    public String printJenisMobilTerbanyak(ArrayList<Nasabah> nasabah){
        HashMap<JenisMobil, Integer> counter = new HashMap<JenisMobil, Integer>();
        for (JenisMobil i: JenisMobil.values()){
            counter.put(i, 0);
        }
        for (Nasabah i: nasabah){
            for (Peminjaman j: i.getPeminjaman()){
                if (j instanceof CicilanMobil){
                    CicilanMobil temp = (CicilanMobil) j;
                    counter.put(temp.getJenis(), counter.get(temp.getJenis())+1);
                }
            }
        }

        JenisMobil terbanyak = JenisMobil.MINIVAN;
        int count = Integer.MIN_VALUE;
        for (JenisMobil i: counter.keySet()){
            if (counter.get(i) > count){
                terbanyak = i;
                count = counter.get(i);
            }
        }

        return "Jenis Mobil Terbanyak yang Dipinjam:\nJenis: " + terbanyak + ", Jumlah Pinjaman: " + count;
    }
}
