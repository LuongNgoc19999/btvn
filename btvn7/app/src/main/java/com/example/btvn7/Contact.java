package com.example.btvn7;

import java.io.Serializable;

public class Contact implements Serializable {
public String name, mess;

    public Contact(String name, String mess) {
        this.name = name;
        this.mess = mess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }
}
