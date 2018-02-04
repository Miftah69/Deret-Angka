package com.example.cahngganteng.deretbilangan;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Miftah on 2/3/2018.
 */

    public class CustomList extends ArrayAdapter<String>{
    private final Activity con;
    private final String[] nama;

    public CustomList(Activity con, String[] nama) {
        super(con, R.layout.activity_label, nama);
        this.con = con;
        this.nama = nama;
    }

    public View getView(int position, View view, ViewGroup viewGroup){
        LayoutInflater inflater = con.getLayoutInflater();
        final View abc = inflater.inflate(R.layout.activity_label, null);

        final TextView txt = (TextView)abc.findViewById(R.id.angka);

        txt.setText(nama[position]);

        return abc;
    }


}
