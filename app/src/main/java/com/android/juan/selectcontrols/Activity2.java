package com.android.juan.selectcontrols;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageButton;
import android.view.View;
import android.widget.Gallery;

public class Activity2 extends AppCompatActivity {

    private AppCompatImageButton imageButton;
    private AppCompatImageButton galeria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        imageButton = findViewById(R.id.activity_3);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mudaActivity3 = new Intent(Activity2.this, Activity3.class);
                startActivity(mudaActivity3);
            }
        });

        galeria = findViewById(R.id.img_camera);
        galeria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent usaGaleria = new Intent(Intent.ACTION_PICK);
                usaGaleria.setType("image/*");
                usaGaleria.setAction(Intent.ACTION_GET_CONTENT);
                String[] mimTypes = {"image/jpeg", "image/png"};
                usaGaleria.putExtra(Intent.EXTRA_MIME_TYPES, mimTypes);
                startActivityForResult(usaGaleria, 0);
            }
        });
    }
}
