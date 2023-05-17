/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farah.aufa_2110010529;

/**
 *
 * @author USER
 */
public class bagihasil_pencuci {
    private int id_bagihasilpencuci;
    private String nama_pencuci;
    private int penghasilan;
    private String slug;
    private String tanggal;
    private String jenis_kendaraan;

    // Constructor
    public bagihasil_pencuci(int id, String nama, int penghasilan, String slug, String tanggal, String jenis_kendaraan) {
        this.id_bagihasilpencuci = id;
        this.nama_pencuci = nama;
        this.penghasilan = penghasilan;
        this.slug = slug;
        this.tanggal = tanggal;
        this.jenis_kendaraan = jenis_kendaraan;
    }

    // Getter dan Setter untuk properti
    public int getId_bagihasilpencuci() {
        return id_bagihasilpencuci;
    }

    public void setId_bagihasilpencuci(int id_bagihasilpencuci) {
        this.id_bagihasilpencuci = id_bagihasilpencuci;
    }

    public String getNama_pencuci() {
        return nama_pencuci;
    }

    public void setNama_pencuci(String nama_pencuci) {
        this.nama_pencuci = nama_pencuci;
    }

    public int getPenghasilan() {
        return penghasilan;
    }

    public void setPenghasilan(int penghasilan) {
        this.penghasilan = penghasilan;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getJenis_kendaraan() {
        return jenis_kendaraan;
    }

    public void setJenis_kendaraan(String jenis_kendaraan) {
        this.jenis_kendaraan = jenis_kendaraan;
    }
}