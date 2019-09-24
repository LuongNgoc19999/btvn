package com.example.ad37_luongngoc_btvn41;

public class Contact {
    public String  phonenb, vitri, tg;
    public boolean image;
    public String name;

    public Contact(String phonenb, String vitri, String tg, boolean image, String name) {
        this.phonenb = phonenb;
        this.vitri = vitri;
        this.tg = tg;
        this.image = image;
        this.name = name;
    }

    public String getPhonenb() {
        return phonenb;
    }

    public void setPhonenb(String phonenb) {
        this.phonenb = phonenb;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public String getTg() {
        return tg;
    }

    public void setTg(String tg) {
        this.tg = tg;
    }

    public boolean isImage() {
        return image;
    }

    public void setImage(boolean image) {
        this.image = image;
    }

    public String isName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
