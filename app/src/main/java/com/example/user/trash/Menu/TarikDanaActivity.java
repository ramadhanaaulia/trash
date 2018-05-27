package com.example.user.trash.Menu;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.trash.R;

public class TarikDanaActivity extends AppCompatActivity {

    TextView txtFullname, txtSaldo;
    Button btnTransfer,btnPulsa, btnSembako;
//    SQLiteHandler sqLiteHandler;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarikdana);

        txtFullname = (TextView) findViewById(R.id.txtFullname);
        txtSaldo = (TextView) findViewById(R.id.txtSaldo);
        btnTransfer = (Button) findViewById(R.id.btnTransfer);
        btnPulsa = (Button) findViewById(R.id.btnPulsa);
        btnSembako = (Button) findViewById(R.id.btnSembako);

//        sqLiteHandler = new SQLiteHandler(TarikDanaActivity.this);
//
//        HashMap<String, String> user = sqLiteHandler.getUserDetails();
//
//        txtFullname.setText(user.get("nama"));
//        txtSaldo.setText(user.get("saldo"));

        btnTransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_SHORT).show();
            }
        });

        btnPulsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_SHORT).show();
            }
        });

        btnSembako.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
