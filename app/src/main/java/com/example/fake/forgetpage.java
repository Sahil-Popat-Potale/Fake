package com.example.fake;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class forgetpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgetpage);
        getSupportActionBar().setTitle("Reset Login Details");
    }
    public void submit(View view) {
        Toast.makeText(this, "Password Changed Successfully", Toast.LENGTH_SHORT).show();

    }
}