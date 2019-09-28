package com.example.btvn51;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterContact extends RecyclerView.Adapter<AdapterContact.ViewHolder> {
    List<Contact> contacts;
    IonclickContact ionclickContact;

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public IonclickContact getIonclickContact() {
        return ionclickContact;
    }

    public void setIonclickContact(IonclickContact ionclickContact) {
        this.ionclickContact = ionclickContact;
    }

    public AdapterContact(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.item_contact, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Contact contact = contacts.get(position);
        holder.tvname.setText(contact.getTen());
        holder.tvnumber.setText(contact.getSdt());
        holder.tvaddress.setText(contact.getDiachi());
        holder.tvtime.setText(contact.getTime());

        holder.tvname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ionclickContact.onclickName(contact.getTen());
            }
        });
        holder.tvnumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ionclickContact.onclickSdt(contact.getSdt());
            }
        });
        holder.tvaddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ionclickContact.onclickDiachi(contact.getDiachi());
            }
        });
        holder.tvtime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ionclickContact.onclickTime(contact.getTime());
            }
        });
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvname, tvnumber, tvtime, tvaddress;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvname = itemView.findViewById(R.id.name);
            tvnumber = itemView.findViewById(R.id.phone);
            tvtime = itemView.findViewById(R.id.times);
            tvaddress = itemView.findViewById(R.id.address);
        }
    }
}
