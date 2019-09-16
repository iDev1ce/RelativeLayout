package com.android.juan.selectcontrols;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private SwitchCompat switchCompat;
    private AppCompatCheckBox playAsRiven;
    private AppCompatCheckBox boxboxFan;
    private AppCompatCheckBox loseToDarius;
    private AppCompatButton btnTestar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchCompat = findViewById(R.id.switch_ativar_localizacao);
        boxboxFan = findViewById(R.id.check_boxbox);
        loseToDarius = findViewById(R.id.check_perde_darius);

        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (!b) {
                    playAsRiven.setChecked(false);
                    playAsRiven.setEnabled(false);
                }
                else
                    playAsRiven.setEnabled(true);

            }
        });

        playAsRiven = findViewById(R.id.check_riven);
        playAsRiven.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

            }
        });

        btnTestar = findViewById(R.id.btn_testar);
        btnTestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abrirActivity2 = new Intent(MainActivity.this, Activity2.class);
                startActivity(abrirActivity2);
            }
        });
    }
}
