package com.example.btvn52_oder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
List<Contact> contacts;
ListView listView;
AdapterContact adapterContact;
TextView soluong, gia;
Button order;
int index = 0;
float tong;
ImageView icon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        soluong = findViewById(R.id.numbers);
        gia = findViewById(R.id.price);
        order = findViewById(R.id.oder);
        icon = findViewById(R.id.img);
        listView = findViewById(R.id.listviews);
        contacts = new ArrayList<>();
        contacts.add(new Contact("Pizza Panda", 0));
        contacts.add(new Contact("KFC Super", 0));
        contacts.add(new Contact("Bread Eggs", 0));
        contacts.add(new Contact("Coca Cola", 0));
        contacts.add(new Contact("Chicken Super", 0));
        contacts.add(new Contact("Cup Cake", 0));
        adapterContact = new AdapterContact(contacts);
        listView.setAdapter(adapterContact);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                contacts.get(i).soluong++;
                index++;
                soluong.setText(String.valueOf(index));
                tong = (float)index*10;
                gia.setText(String.valueOf(tong));
            }
        });
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Order thanh cong",Toast.LENGTH_LONG).show();
            }
        });
        icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Order.class);
                startActivity(intent);
            }
        });
    }
}
