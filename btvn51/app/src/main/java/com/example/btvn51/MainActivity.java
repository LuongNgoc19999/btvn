package com.example.btvn51;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Contact> contacts;
    AdapterContact adapterContact;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycleview);
        contacts = new ArrayList<>();
        contacts.add(new Contact("Mr A", "0822592610","HN","14:00"));
        contacts.add(new Contact("Mr B", "0822592611","HCM","14:00"));
        contacts.add(new Contact("Mr C", "0822592612","HN","14:00"));
        contacts.add(new Contact("Mr D", "0822592613","HCM","14:00"));
        contacts.add(new Contact("Mr E", "0822592614","HCM","14:00"));
        contacts.add(new Contact("Mr F", "0822592615","HN","14:00"));
        contacts.add(new Contact("Mr G", "0822592616","HN","14:00"));
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getBaseContext(), LinearLayoutManager.VERTICAL, false);
        adapterContact = new AdapterContact(contacts);
        adapterContact.setIonclickContact(new IonclickContact() {
            @Override
            public void onclickName(String name) {
                Toast.makeText(getBaseContext(), name,Toast.LENGTH_LONG ).show();
            }

            @Override
            public void onclickSdt(String sdt) {
                Toast.makeText(getBaseContext(), sdt, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onclickDiachi(String diachi) {
                Toast.makeText(getBaseContext(), diachi, Toast.LENGTH_LONG).show();

            }

            @Override
            public void onclickTime(String time) {
                Toast.makeText(getBaseContext(), time, Toast.LENGTH_LONG).show();

            }
        });
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterContact);
    }
}
