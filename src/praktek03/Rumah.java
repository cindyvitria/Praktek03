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
public class Rumah {
    private String warna;
    private String bahan;
    private int jmlkamar;
    
    void cetakInfo(){
        System.out.println("Warna \t: "+warna+"\n"+"Bahan \t: "+bahan+"\n"
                +"Jumlah Kamar\t: "+jmlkamar);
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public int getJmlkamar() {
        return jmlkamar;
    }

    public void setJmlkamar(int jmlkamar) {
        this.jmlkamar = jmlkamar;
    }
    
}
