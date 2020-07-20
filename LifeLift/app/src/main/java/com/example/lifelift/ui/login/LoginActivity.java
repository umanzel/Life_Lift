package com.example.lifelift.ui.login;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lifelift.MainActivity;
import com.example.lifelift.R;

public class LoginActivity extends AppCompatActivity {

    private LoginViewModel loginViewModel;
    private Button mLogin;
    private TextView mCadastrar;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mLogin = (Button) findViewById(R.id.login);
        mCadastrar = (TextView) findViewById(R.id.cadastrar);

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
                finish();
                return;
            }
        });

        mCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, SignUp.class));
                finish();
                return;
            }
        });
    }
}
