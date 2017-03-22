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
public class Kelas {
    private String namaKelas;
    private Matakuliah matakuliah;
    private Mahasiswa[] anggota;
    private Tugas[] tugas = new Tugas[10];

    public Kelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public Matakuliah getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(Matakuliah matakuliah) {
        this.matakuliah = matakuliah;
        anggota = new Mahasiswa[matakuliah.getMaxTampung()];
    }
    
    public void createTugas(String tugas){
        Tugas t = new Tugas();
        t.setNamaTugas(tugas);
        
        for(int i = 0; i <= this.tugas.length; i++){
            if(this.tugas[i] == null){
                this.tugas[i] = t;
                break;
            }
        }
    }
    
    public void addMahasiswa(Mahasiswa m){
        for(int i = 0; i <= anggota.length; i++){
            if(anggota[i] == null){
                anggota[i] = m;
                break;
            }
        }
    }
    
    
}
