package com.example.nihar.trialalpha;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.ml.vision.common.FirebaseVisionImage;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TTS.Initalize(this);
        TTS.speak("Client App Started");

    }
    public void TextRecognition(View view){
        Intent inte = new Intent(MainActivity.this,TextRecognition.class);
        startActivity(inte);
    }

}
