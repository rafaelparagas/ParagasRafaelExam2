package com.paragas.rafael;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this, MyCustomService.class);
        startService(i);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btNext) {
            i = new Intent(this, Main2Activity.class);
            startActivity(i);
        }
        else if (v.getId()==R.id.btnMap){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("http://maps.google.com/maps?q=loc:" + 14.610104  + "," + 120.991905));
            chooser =  Intent.createChooser(i, "Choose A Map APP");
            startActivity(chooser);
        }
    }
}

