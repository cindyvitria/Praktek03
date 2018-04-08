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
        
        System.out.print("Warnanya \t: ");
        System.out.println(Cendeh.getWarna());
        System.out.print("Bahannya \t: ");
        System.out.println(Cendeh.getBahan());
        System.out.print("Jumlah Kamarnya \t: ");
        System.out.println(Cendeh.getJmlkamar());
    }
}
