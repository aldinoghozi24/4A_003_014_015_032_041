package com.example.modul2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login_button;
    EditText username,pass;
    TextView reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=(EditText) findViewById(R.id.username);
        pass=(EditText) findViewById(R.id.pass);
        login_button=(Button) findViewById(R.id.login_button);
        reg=(TextView) findViewById(R.id.reg);

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userkey=username.getText().toString();
                String passkey=pass.getText().toString();

                if (userkey.equals("admin")&&passkey.equals("admin")){
                    Toast.makeText(getApplicationContext(),"Login Berhasil",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, welcome.class);
                    MainActivity.this.startActivity(intent);
                    finish();
                }else{
                    AlertDialog.Builder builder =new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Username/Password salah").show();
                    pass.setText("");
                    username.setText("");
                }
            }
        });

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Register.class);
                MainActivity.this.startActivity(intent);
                finish();
            }
        });

    }
}
