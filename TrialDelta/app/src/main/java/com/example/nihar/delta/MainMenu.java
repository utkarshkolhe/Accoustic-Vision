package com.example.nihar.delta;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        SharedPreferences sharedPref;
        sharedPref= getSharedPreferences("myPref", Context.MODE_PRIVATE);
        String userId=sharedPref.getString("user_id","");
        Toast.makeText(this,"Logged in as : "+userId,Toast.LENGTH_SHORT).show();
    }
}
