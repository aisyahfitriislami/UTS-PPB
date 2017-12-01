package com.uts.ppb.uts_ppb;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user, pass;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = (EditText) findViewById(R.id.user);
        pass = (EditText) findViewById(R.id.pass);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userkey = user.getText().toString();
                String passkey = pass.getText().toString();

                if (userkey.equals("admin") && passkey.equals("admin")) {
                    Toast.makeText(getApplicationContext(), "LOGIN BERHASIL",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, main_menu.class);
                    startActivity(intent);

                } else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Username atau Password Anda Salah! Silahkan Coba Lagi")
                            .setNegativeButton("Retry", null).create().show();
                }
            }
        });
    }
}
