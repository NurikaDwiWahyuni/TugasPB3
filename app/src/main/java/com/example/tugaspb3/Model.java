package com.example.tugaspb3;

public class Model {

    int foto;
    String nama,nim;

    public Model(int foto, String nama, String nim) {
        this.foto = foto;
        this.nama = nama;
        this.nim = nim;

    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}
