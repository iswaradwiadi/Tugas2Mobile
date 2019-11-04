package com.sudrajad.recycleview;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.widget.ImageView;

public class Mahasiswa {

    private String nama, keterangan, tahunlahir;
    private Drawable gambar;

    public Mahasiswa(String nama, String keterangan, String tahunlahir, Drawable gambar) {
        this.nama = nama;
        this.keterangan = keterangan;
        this.tahunlahir = tahunlahir;
        this.gambar = gambar;
    }

    public Drawable getGambar() {
        return gambar;
    }

    public void setGambar(Drawable gambar) {
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String nim) {
        this.keterangan = keterangan;
    }

    public String getTahunlahir() {
        return tahunlahir;
    }

    public void setTahunlahir(String tahunlahir) {
        this.tahunlahir = tahunlahir;
    }
}
