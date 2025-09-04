package com.furionkelompok2.tugaslayout;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class LinearLayoutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear); // pastikan sesuai nama xml

        Button btnExit = findViewById(R.id.btnExit);
        btnExit.setOnClickListener(v -> {
            new AlertDialog.Builder(LinearLayoutActivity.this)
                    .setTitle("Keluar Aplikasi")
                    .setMessage("Apakah kamu yakin ingin keluar?")
                    .setPositiveButton("Ya", (dialog, which) -> {
                        finishAffinity(); // keluar dari semua activity
                    })
                    .setNegativeButton("Tidak", (dialog, which) -> dialog.dismiss())
                    .show();
        });
    }
}
