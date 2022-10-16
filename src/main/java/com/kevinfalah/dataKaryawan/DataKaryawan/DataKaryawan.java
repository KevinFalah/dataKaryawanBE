package com.kevinfalah.dataKaryawan.DataKaryawan;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "datakaryawan")
public class DataKaryawan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nik", nullable = false, unique = true)
    private int nik;

    @Column(name = "namaLengkap", nullable = false)
    private String namaLengkap;

    @Column(name = "jenisKelamin", nullable = false)
    private String jenisKelamin;

    @Column(name = "tanggalLahir", nullable = false)
    private LocalDate tanggalLahir;

    @Column(name = "alamat", nullable = false)
    private String alamat;

    @Column(name = "negara", nullable = false)
    private String negara;

    public DataKaryawan(Long id, int nik, String namaLengkap, String jenisKelamin, LocalDate tanggalLahir, String alamat, String negara) {
        this.id = id;
        this.nik = nik;
        this.namaLengkap = namaLengkap;
        this.jenisKelamin = jenisKelamin;
        this.tanggalLahir = tanggalLahir;
        this.alamat = alamat;
        this.negara = negara;
    }

    public DataKaryawan() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNik() {
        return nik;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNegara() {
        return negara;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }
}
