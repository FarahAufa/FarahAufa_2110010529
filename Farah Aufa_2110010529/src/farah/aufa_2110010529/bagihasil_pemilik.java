/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farah.aufa_2110010529;

/**
 *
 * @author USER
 */
public class bagihasil_pemilik {
    private int id_bagihasilpemilik;
    private String tanggal;
    private int keuntungan;
    private String jenis_kendaraan;
    
    // Constructor
    public bagihasil_pemilik(int id, String tgl, int keunt, String jenis) {
        this.id_bagihasilpemilik = id;
        this.tanggal = tgl;
        this.keuntungan = keunt;
        this.jenis_kendaraan = jenis;
    }
    
    // Getter dan Setter untuk properti
    public int getId_bagihasilpemilik() {
        return id_bagihasilpemilik;
    }

    public void setId_bagihasilpemilik(int id_bagihasilpemilik) {
        this.id_bagihasilpemilik = id_bagihasilpemilik;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getKeuntungan() {
        return keuntungan;
    }

    public void setKeuntungan(int keuntungan) {
        this.keuntungan = keuntungan;
    }

    public String getJenis_kendaraan() {
        return jenis_kendaraan;
    }

    public void setJenis_kendaraan(String jenis_kendaraan) {
        this.jenis_kendaraan = jenis_kendaraan;
    }
}
