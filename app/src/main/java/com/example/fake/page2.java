package com.example.fake;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        getSupportActionBar().setTitle("Home Page");
    }

    public void subjects(View view) {
        Toast.makeText(this, "Opening next page", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this,page3.class));
    }

    public void faculty(View view) {
        Toast.makeText(this, "Opening next page", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this,page3.class));
    }

    public void students(View view) {
        Toast.makeText(this, "Opening next page", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this,page3.class));
    }

    public void erp(View view) {
        Toast.makeText(this, "Opening next page", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this,page3.class));
    }

    public void back(View view) {
        Toast.makeText(this, "Going Back", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this,MainActivity.class));
    }
}