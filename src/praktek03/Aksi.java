/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek03;

/**
 *
 * @author ACER
 */
public class Aksi {
    public static void main(String[] args) {
        Rumah Cendeh = new Rumah();
        
        
        Cendeh.setWarna("Biru");
        Cendeh.setBahan("Beton");
        Cendeh.setJmlkamar(2);
        
        Cendeh.cetakInfo();
        
        System.out.println("");
        System.out.print("Warnanya \t: ");
        System.out.println(Cendeh.getWarna());
        System.out.print("Bahannya \t: ");
        System.out.println(Cendeh.getBahan());
        System.out.print("Jumlah Kamarnya : ");
        System.out.println(Cendeh.getJmlkamar());
        System.out.println("");
        
        RumahAdat Banjar = new RumahAdat();
        Banjar.setWarna("Coklat");
        Banjar.setBahan("Kayu");
        Banjar.setJmlkamar(10);
        Banjar.setDaerah("Banjar");
        Banjar.setNama("Bubungan Tinggi");
        Banjar.cetakInfo();
        System.out.println("Nama Daerah \t: "+Banjar.getDaerah());
        System.out.println("Nama Bangunan\t: "+Banjar.getNama());
        Banjar.throttle();
        System.out.println("**************************************");
        
        RumahSusun RS = new RumahSusun();
        RS.setWarna("Cream");
        RS.setBahan("Semen");
        RS.setJmlkamar(100);
        RS.setJmllantai(10);
        RS.setFasilitas("AC, Wifi dan TV");
        RS.cetakInfo();
        System.out.println("Jumlah Lantai \t: "+RS.getJmllantai());
        System.out.println("Fasilitas \t: "+RS.getFasilitas());
        System.out.println("######################################");
        
        Perumahan Wengga = new Perumahan();
        Wengga.setWarna("Abu - Abu");
        Wengga.setBahan("Semen");
        Wengga.setJmlkamar(2);
        Wengga.setTipe(36);
        Wengga.setJenis("Minimalis");
        Wengga.cetakInfo();
        System.out.println("Tipe Rumah \t: "+Wengga.getTipe());
        System.out.println("Jenis Perumahan : "+Wengga.getJenis());
    }
}
