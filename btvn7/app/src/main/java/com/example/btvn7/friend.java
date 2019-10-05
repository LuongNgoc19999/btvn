package com.example.btvn7;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class friend extends Fragment {
    List<Contact> contacts;
    AdapterContact adapterContact;
    ListView contactList;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.friend, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        contacts = new ArrayList<>();

        Bundle bundle =  getArguments();
        contacts.add((ArrayList<Contact>)bundle.getString("list"));
        contactList = view.findViewById(R.id.listfriend);
    }
}
