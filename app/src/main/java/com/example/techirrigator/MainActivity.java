package com.example.techirrigator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ActivityCompat.requestPermissions(MainActivity.this, new String[] {Manifest.permission.SEND_SMS, Manifest.permission.READ_SMS}, PackageManager.PERMISSION_GRANTED);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if (id==R.id.share) {
            Toast.makeText(MainActivity.this,
                    "Share ", Toast.LENGTH_LONG).show();
            return true;
        }
        if (id==R.id.weather) {
            Intent intentprofile=new Intent(MainActivity.this,Weather.class);

            startActivity(intentprofile);

            //Intent intentProfile=new Intent(MainActivity.this, cityFinder.class);
            //startActivity(intentProfile);

            return true;
        }
        if (id==R.id.report) {
            Intent intentprofile=new Intent(MainActivity.this,dataBase.class);

            startActivity(intentprofile);

            return true;
        }
        if (id==R.id.camera) {
            Intent intentprofile=new Intent(MainActivity.this,Camera.class);

            startActivity(intentprofile);

            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void sendSMS1(View view) {
        String message1 = "ON";
        //   String message2 = "OFF MOTOR";
        String number = "9782789259";

        SmsManager mySmsManager = SmsManager.getDefault();
        mySmsManager.sendTextMessage(number, null, message1, null, null);
        Toast.makeText(MainActivity.this,
                "Message 'ON' Sent ", Toast.LENGTH_LONG).show();
        //   mySmsManager.sendTextMessage(number, null, message2, null, null);

    }
    public void sendSMS2(View view) {
        // String message1 = "ON MOTOR";
        String message2 = "OFF";
        String number = "9782789259";

        SmsManager mySmsManager = SmsManager.getDefault();
        //  mySmsManager.sendTextMessage(number, null, message1, null, null);
        mySmsManager.sendTextMessage(number, null, message2, null, null);
        Toast.makeText(MainActivity.this,
                "Message 'OFF' Sent ", Toast.LENGTH_LONG).show();

    }
 /*   @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
        //return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if (id==R.id.share) {
            //further logic
            return true;
        }
        if (id==R.id.weather) {
            Intent intentprofile=new Intent(MainActivity.this,Weather.class);
            startActivity(intentprofile);

            return true;
        }
        return super.onOptionsItemSelected(item);
    }           */
}
