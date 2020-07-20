package com.example.lifelift.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lifelift.MainActivity;
import com.example.lifelift.R;

public class SignUp extends AppCompatActivity {

    private Button mEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        mEnviar = (Button) findViewById(R.id.bCadastrar);

        mEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUp.this, LoginActivity.class));
                finish();
                return;
            }
        });
    }
}
