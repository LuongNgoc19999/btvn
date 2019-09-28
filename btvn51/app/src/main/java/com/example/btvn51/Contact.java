package com.example.btvn51;

import java.io.Serializable;

public class Contact implements Serializable {
    public String ten, sdt, diachi, time;

    public Contact(String ten, String sdt, String diachi, String time) {
        this.ten = ten;
        this.sdt = sdt;
        this.diachi = diachi;
        this.time = time;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
