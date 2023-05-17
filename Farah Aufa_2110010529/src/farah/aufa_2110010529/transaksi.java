/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farah.aufa_2110010529;

/**
 *
 * @author USER
 */
import java.util.Date;

public class transaksi {
    private int id_transaksi;
    private String nama_user;
    private String nama_pencuci;
    private String nama_pelanggan;
    private String no_plat;
    private String nama_paket;
    private Date tanggal;

    // Constructor
    public transaksi(int id_transaksi, String nama_user, String nama_pencuci, String nama_pelanggan, String no_plat, String nama_paket, Date tanggal) {
        this.id_transaksi = id_transaksi;
        this.nama_user = nama_user;
        this.nama_pencuci = nama_pencuci;
        this.nama_pelanggan = nama_pelanggan;
        this.no_plat = no_plat;
        this.nama_paket = nama_paket;
        this.tanggal = tanggal;
    }

    // Getter dan Setter untuk properti
    public int getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public String getNama_user() {
        return nama_user;
    }

    public void setNama_user(String nama_user) {
        this.nama_user = nama_user;
    }

    public String getNama_pencuci() {
        return nama_pencuci;
    }

    public void setNama_pencuci(String nama_pencuci) {
        this.nama_pencuci = nama_pencuci;
    }

    public String getNama_pelanggan() {
        return nama_pelanggan;
    }

    public void setNama_pelanggan(String nama_pelanggan) {
        this.nama_pelanggan = nama_pelanggan;
    }

    public String getNo_plat() {
        return no_plat;
    }

    public void setNo_plat(String no_plat) {
        this.no_plat = no_plat;
    }

    public String getNama_paket() {
        return nama_paket;
    }

    public void setNama_paket(String nama_paket) {
        this.nama_paket = nama_paket;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }
}