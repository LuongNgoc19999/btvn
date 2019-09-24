package com.example.ad37_luongngoc_btvn41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterContact extends BaseAdapter {
    List<Contact> contact;

    public AdapterContact(List<Contact> contact) {
        this.contact = contact;
    }

    public List<Contact> getContacts() {
        return contact;
    }

    public void setContacts(List<Contact> contacts) {
        this.contact = contact;
    }

    @Override
    public int getCount() {

        return contact.size();
    }

    @Override
    public Object getItem(int i) {

        return contact.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View v = inflater.inflate(R.layout.item1, viewGroup, false);

        ImageView imgview = v.findViewById(R.id.img);
        TextView tvphone = v.findViewById(R.id.sdt);
        TextView tvvitri = v.findViewById(R.id.vitris);
        TextView tvtime = v.findViewById(R.id.timess);

        Contact contac = contact.get(i);
        if (contac.isImage()) {
            imgview.setImageResource(R.drawable.kkk);
        }
        tvphone.setText(contac.getPhonenb());
        tvvitri.setText(contac.getVitri());
        tvtime.setText(contac.getTg());

        return v;
    }
}
