package com.example.webservice;

import java.io.Serializable;

public class DataItem implements Serializable {
    String nama;
    String nrp;
    String hobby;
    int umur;

    public DataItem(String nama, int umur, String nrp, String hobby) {
        this.nama = nama;
        this.nrp = nrp;
        this.umur = umur;
        this.hobby = hobby;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
