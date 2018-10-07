package com.example.nihar.delta;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences sharedPref;
        sharedPref= getSharedPreferences("myPref", Context.MODE_PRIVATE);
        String userId=sharedPref.getString("user_id","");
        Intent inte;
        if(userId.equals("")){
            inte = new Intent(MainActivity.this,Login.class);
        }
        else{
            inte = new Intent(MainActivity.this,MainMenu.class);
        }
        startActivity(inte);
    }

}
