package com.example.user.trash;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

//import com.example.user.trash.Login.LoginActivityTest;

public class RegistrasiActivityCount extends AppCompatActivity {

    Spinner spinner_list_Provinsi, spinner_list_Kabupaten, spinner_list_Kecamatan, spinner_list_Kelurahan;
    EditText edit_txtRt, edit_txtRw;
    Button btnRegistrasi;
//    SQLiteHandler sqLiteHandler;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_count);

        btnRegistrasi = (Button) findViewById(R.id.btnRegistrasi);

        edit_txtRt = (EditText) findViewById(R.id.edit_txtRt);
        edit_txtRw = (EditText) findViewById(R.id.edit_txtRw);

        spinner_list_Provinsi = (Spinner) findViewById(R.id.spinner_list_Provinsi);
        spinner_list_Kabupaten = (Spinner) findViewById(R.id.spinner_list_Kabupaten);
        spinner_list_Kecamatan = (Spinner) findViewById(R.id.spinner_list_Kecamatan);
        spinner_list_Kelurahan = (Spinner) findViewById(R.id.spinner_list_Kelurahan);

//        sqLiteHandler = new SQLiteHandler(this);

        btnRegistrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                sqLiteHandler.addDatabase("nasabah",
//                        getIntent().getStringExtra("nama"),
//                        getIntent().getStringExtra("password"),
//                        getIntent().getStringExtra("no_hp"));
                Toast.makeText(getApplicationContext(), "Registrasi Berhasil, Silahkan login.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(String.valueOf(RegistrasiActivityCount.this));
                startActivity(intent);
                finish();
            }
        });
    }
}
