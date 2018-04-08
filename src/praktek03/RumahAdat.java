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
public class RumahAdat extends Rumah{
    private String daerah;
    private String nama;
    
    void throttle(){
        System.out.println("Rumah Banjar.... :D");
    }

    public String getDaerah() {
        return daerah;
    }

    public void setDaerah(String daerah) {
        this.daerah = daerah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
}
