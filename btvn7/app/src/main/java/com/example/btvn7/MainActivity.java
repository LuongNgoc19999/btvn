package com.example.btvn7;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
Button btfriend, btmess;
friend friend1;
message message1;
List<Contact> contacts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contacts = new ArrayList<>();
        contacts.add(new Contact("Mr A", "hi"));
        contacts.add(new Contact("Mr B", "hi"));
        contacts.add(new Contact("Mr C", "hi"));
        contacts.add(new Contact("Mr D", "hi"));
        contacts.add(new Contact("Mr E", "hi"));

        btfriend = findViewById(R.id.btfriend);
        btmess = findViewById(R.id.btmessage);
        friend1 = new friend();
        message1 = new message();

        getSupportFragmentManager().beginTransaction().add(R.id.framlayout, friend1, friend.class.getName())
                .add(R.id.framlayout, message1, message.class.getName()).commit();


        btfriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("name", String.valueOf(contacts));
                friend1.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().show(friend1).hide(message1).commit();
            }
        });
        btmess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().show(message1).hide(friend1).commit();
            }
        });

    }
}
