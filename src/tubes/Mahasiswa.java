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
public class Mahasiswa extends Orang{
    private String nim;
    private char jenisKelamin;
    private String fakultas;

    public Mahasiswa(String nama, String nim, char jenisKelamin, String fakultas) {
        super.setNama(nama);
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.fakultas = fakultas;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(char jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    
    
}
