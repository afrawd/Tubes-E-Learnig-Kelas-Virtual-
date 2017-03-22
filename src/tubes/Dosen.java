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
public class Dosen extends Orang{
    private String nip;
    private Kelas daftarKelas[]= new Kelas[4];

    public Dosen(String nama, String nip) {
        super.setNama(nama);
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public void createKelas(String namaKelas){
        Kelas k = new Kelas(namaKelas);
        
        for(int i = 0; i <= daftarKelas.length; i++){
            if(daftarKelas[i] == null){
                daftarKelas[i] = k;
                break;
            }
        }
    }
    
    
    
    
    
    
}
