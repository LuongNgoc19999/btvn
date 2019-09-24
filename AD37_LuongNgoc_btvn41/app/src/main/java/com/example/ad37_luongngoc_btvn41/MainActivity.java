package com.example.ad37_luongngoc_btvn41;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Contact> contact;
    AdapterContact adapterContact;
    ListView lvcontacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvcontacts = findViewById(R.id.Lview);

        contact = new ArrayList<>();
        contact.add( new Contact("0822592610","Ha Noi", "14:00", true, "Mr A" ));
        contact.add( new Contact("0822592611","Ha Noi", "14:00", true, "Mr B" ));
        contact.add( new Contact("0822592612","Ha Noi", "14:00", true, "Mr C" ));
        contact.add( new Contact("0822592613","Ha Noi", "14:00", true, "Mr D" ));
        contact.add( new Contact("0822592614","Ha Noi", "14:00", true, "Mr E" ));
        contact.add( new Contact("0822592615","Ha Noi", "14:00", true, "Mr F" ));
        contact.add( new Contact("0822592616","Ha Noi", "14:00", true, "Mr G" ));
        contact.add( new Contact("0822592617","Ha Noi", "14:00", true, "Mr H" ));
        contact.add( new Contact("0822592618","Ha Noi", "14:00", true, "Mr I" ));
        contact.add( new Contact("0822592619","Ha Noi", "14:00", true, "Mr L" ));
        contact.add( new Contact("0822592620","Ha Noi", "14:00", true, "Mr M" ));

        adapterContact = new AdapterContact(contact);
        lvcontacts.setAdapter(adapterContact);

        lvcontacts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, contact_activity.class);
                Bundle bundle = new Bundle();
                bundle.putString("sdt", contact.get(i).getPhonenb());
                bundle.putString("vitri", contact.get(i).getVitri());
                bundle.putString("tg", contact.get(i).getTg());
                bundle.putBoolean("image", contact.get(i).isImage());
                bundle.putString("name", contact.get(i).getName());
                intent.putExtras(bundle);

                startActivity(intent);
            }
        });

    }
}
