package com.example.modul2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class welcome extends AppCompatActivity {

    ImageView bird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        bird=(ImageView) findViewById(R.id.bird);
        bird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(welcome.this, MainActivity.class);
                welcome.this.startActivity(intent);
                finish();
            }
        });
    }
}
