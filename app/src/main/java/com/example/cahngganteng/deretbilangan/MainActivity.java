package com.example.cahngganteng.deretbilangan;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText N1, N2;
    private Button BHitung;
    private ListView ListHasil;

    CustomList customList;
    String names[];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        N1 = (EditText) findViewById(R.id.nilai1);
        N2 = (EditText) findViewById(R.id.nilai2);
        BHitung = (Button) findViewById(R.id.hitung);

        ListHasil = (ListView) findViewById(R.id.list);

        BHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitungDeret();
                customList = new CustomList(MainActivity.this, names);

                ListHasil.setAdapter(customList);
          }
        });
    }

    public void hitungDeret(){
        String a = N1.getText().toString();
        String b = N2.getText().toString();

        int awal = Integer.parseInt(a); ;
        int akhir = Integer.parseInt(b);


        List<String> deretAngka = new ArrayList<String>() ;

        for(int i = awal + 1 ; i <= akhir; i++ ){
            int mod1 = i % 3;
            int mod2 = i % 4;

            if( mod1 == 0 && mod2 == 0) {

                deretAngka.add("Yeay");

            } else if(mod1 == 0 || mod2 == 0){
                deretAngka.add(""+i);
            }

        }

        names = deretAngka.toArray(new String[deretAngka.size()]);

    }

}
