package com.uts.ppb.uts_ppb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by User on 12/11/2017.
 */

public class main_menu extends AppCompatActivity {
    Button list, tentang, keluar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_utama);
        list = (Button) findViewById(R.id.list_olahraga);
        tentang = (Button) findViewById(R.id.about);
        keluar = (Button) findViewById(R.id.exit);

        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(main_menu.this, list_olahraga.class);
                startActivity(i);
            }
        });
        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(main_menu.this, about.class);
                startActivity(i);
            }
        });
        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(main_menu.this, MainActivity.class);
                startActivity(i);
            }

        });
    }
}
