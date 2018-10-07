package com.example.nihar.trialbeta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void onclick(View view){
        Intent inte= new Intent(Main3Activity.this,Camera.class);
        startActivity(inte);
    }
}
