package com.example.project1.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.project1.MainActivity;
import com.example.project1.R;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity2 extends AppCompatActivity {

    ProgressBar progressBar;
    FirebaseAuth auth;

    private Intent LoginActivity;
    private Intent RegistrationActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        auth=FirebaseAuth.getInstance();
        progressBar = findViewById(R.id.progressbar) ;
        progressBar.setVisibility(View.GONE);
        if (auth.getCurrentUser()!= null){
            progressBar.setVisibility(View.VISIBLE);
            Intent i = new Intent( this, MainActivity.class);
            startActivity(i);
            Toast.makeText(this,"please wait you are already logged in ",Toast.LENGTH_SHORT).show();
            finish();

        }
    }

    public void login(View view) {
        startActivity(new Intent(MainActivity2.this, com.example.project1.activities.LoginActivity.class));
    }

    public void registration(View view) {
        startActivity(new Intent(MainActivity2.this, com.example.project1.activities.RegistrationActivity.class));
    }
}