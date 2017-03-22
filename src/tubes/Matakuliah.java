/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author AFRA WD
 */
public class Matakuliah {
    private String namaMk;
    private String kodeMk;
    private int maxTampung;

    public Matakuliah(String namaMk, String kodeMk, int maxTampung) {
        this.namaMk = namaMk;
        this.kodeMk = kodeMk;
        this.maxTampung = maxTampung;
    }

    public String getNamaMk() {
        return namaMk;
    }

    public void setNamaMk(String namaMk) {
        this.namaMk = namaMk;
    }

    public String getKodeMk() {
        return kodeMk;
    }

    public void setKodeMk(String kodeMk) {
        this.kodeMk = kodeMk;
    }

    public int getMaxTampung() {
        return maxTampung;
    }

    public void setMaxTampung(int maxTampung) {
        this.maxTampung = maxTampung;
    }
    
    
    
}
