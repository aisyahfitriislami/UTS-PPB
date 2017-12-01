package com.uts.ppb.uts_ppb;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by User on 13/11/2017.
 */

public class list_olahraga extends AppCompatActivity {
    String[] listArray={"Lari","Futsal","Basket","Bulutangkis","Tenis",};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_olahraga);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.activity_list_view, listArray);
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);
listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (position==0) {
            Intent lari = new Intent(view.getContext(), detail_olahragalari.class);
            startActivityForResult(lari, 0);
        }
        if (position==1) {
            Intent futsal = new Intent(view.getContext(), detail_olahragafutsal.class);
            startActivityForResult(futsal, 1);
        }
        if (position==2) {
            Intent basket = new Intent(view.getContext(), detail_olahragabasket.class);
            startActivityForResult(basket, 2);
        }
        if (position==3) {
            Intent bulutangkis = new Intent(view.getContext(), detail_olahragabulutangkis.class);
            startActivityForResult(bulutangkis, 3);
        }
        if (position==4) {
            Intent tenis = new Intent(view.getContext(), detail_olahragatenis.class);
            startActivityForResult(tenis, 4);
        }
    }
});
}
}