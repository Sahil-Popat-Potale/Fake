package com.example.fake;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Login Page");
    }

    public void nextpage(View view) {
        Toast.makeText(this, "Opening next page", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this,page2.class));
    }
    public void forget_page(View view) {
        Toast.makeText(this, "Opening Forget page", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, forgetpage.class));
    }
    public void ajeenkya(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://adypu.edu.in/")));
    }
}