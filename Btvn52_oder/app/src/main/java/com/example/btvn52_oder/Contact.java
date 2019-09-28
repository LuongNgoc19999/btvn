package com.example.btvn52_oder;

public class Contact {
    public String food;
    public int soluong = 0;

    public Contact(String food, int soluong) {
        this.food = food;
        this.soluong = soluong;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
}
